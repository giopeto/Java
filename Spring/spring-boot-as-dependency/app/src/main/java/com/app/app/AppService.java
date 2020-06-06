package com.app.app;

import com.appdependency.appdependency.AppDepService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppService {

    private AppDepService appDepService;

    public String hello() {
        return appDepService.hello();
    }
}
