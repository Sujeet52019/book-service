package com.book.service.config;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BookServiceConfig {
	
	@Bean
	public RestTemplate restTemplate() {

	return new RestTemplate();
	}

}
