package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private static ApplicationContext applicationContext;


	@Autowired
	private static GenericApplicationContext genericApplicationContext;

	@Autowired
	AppMessage appMessage;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		registerBean();
	}

	private static void registerBean() {
		Optional<PrintMessage> printMessageBean = Optional.of(DemoApplication.applicationContext.getBean(PrintMessage.class));

		if(!printMessageBean.isPresent()) {
			genericApplicationContext.registerBean("printMessageDefaultImpl", PrintMessageDefaultImpl.class,
					() -> new PrintMessageDefaultImpl());
		}

	}

	@PostConstruct
	public void init() {
		System.out.println(appMessage.message());
	}


}

@Component
class AppMessage {

	@Autowired
	PrintMessage printMessage;

	public String message() {
		return printMessage.getMessage();
	}


}





interface PrintMessage {
	String getMessage();
}


class PrintMessageDefaultImpl implements PrintMessage {

	public PrintMessageDefaultImpl() {}

	@Override
	public String getMessage() {
		return "Main message";
	}
}


class PrintMessageSecondImpl implements PrintMessage {

	@Override
	public String getMessage() {
		return "Second message";
	}
}