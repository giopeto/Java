package com.example.springboothibernate.martians;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@AllArgsConstructor
public class SpringBootHibernateApplicationMartians {

    @NonNull
    private final InitTestData initTestData;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHibernateApplicationMartians.class);
    }

    @PostConstruct
    public void init() {
        initTestData.init();
    }
}
