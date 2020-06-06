package com.app.app;

import com.appdependency.appdependency.AppDepService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AppDepService appDepService() {
        return new AppDepService();
    }
}
