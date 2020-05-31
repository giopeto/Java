package com.springbootmicrometerprometheusgrafana;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

    private StarWarsRestApiService starWarsRestApiService;

    @GetMapping
    public String hello() {
        return "Hello";
    }

    @GetMapping("1")
    public String hello1() {
        return "Hello 1";
    }

    @GetMapping("2")
    public String hello2() {
        return "Hello 2";
    }

    @GetMapping("people")
    public String swapi() {
        return starWarsRestApiService.getPeople();
    }
}
