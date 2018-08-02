package com.hu.demoEurekaConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {
	
	@Autowired
	private RestTemplate restTemplate;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
       String obj = restTemplate.getForObject("http://service-xiaozhi/hello", String.class);
       return obj;
    }
}
