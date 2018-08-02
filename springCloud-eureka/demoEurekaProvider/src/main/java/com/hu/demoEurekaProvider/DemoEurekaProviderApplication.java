package com.hu.demoEurekaProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现
//与 EnableEurekaClient一样
@SpringBootApplication
@EnableEurekaClient
public class DemoEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaProviderApplication.class, args);
	}
}
