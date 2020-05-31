package com.springbootmicrometerprometheusgrafana;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StarWarsRestApiServiceImpl implements StarWarsRestApiService {

    RestTemplate restTemplate = new RestTemplate();

    public String getPeople() {
        return restTemplate.getForEntity("https://swapi.dev/api/people/", String.class).getBody().toString();
    }
}
