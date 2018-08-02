package com.hu.demoEurekaProvider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoEurekaProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaProvider2Application.class, args);
	}
}
