package com.hu.demoEurekaProvider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class indexController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String index() {
    	System.out.println("服务调用地址：http://localhost:8764");
        return "Hello World";
    }
}
