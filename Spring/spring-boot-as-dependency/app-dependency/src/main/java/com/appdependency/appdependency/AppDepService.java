package com.appdependency.appdependency;

import org.springframework.stereotype.Service;

@Service
public class AppDepService {

    public String hello() {
        return "Hello from AppDepService[AppDependencyApplication]";
    }
}
