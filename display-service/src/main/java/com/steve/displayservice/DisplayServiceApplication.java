package com.steve.displayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DisplayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayServiceApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate getRT() {
		return new RestTemplate();
	}
}
