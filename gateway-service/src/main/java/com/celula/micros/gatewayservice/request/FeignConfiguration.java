package com.celula.micros.gatewayservice.request;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class FeignConfiguration {
	
	
	@Bean
	public BasicAuthenticationInterceptor basicAuthenticationInterceptor (
			@Value("${spring.security.user.name}") String username,
			@Value("${spring.security.user.password}") String password) 
	{
		
		return new BasicAuthenticationInterceptor(username, password);
		
		
	}
	
	

}
