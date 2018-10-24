package com.naeemsiddiq.eurekaclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClientApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientApp.class, args);
	}
}
