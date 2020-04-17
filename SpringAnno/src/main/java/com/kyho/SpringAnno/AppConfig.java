package com.kyho.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Dependency Injector :  @Configuration

@Configuration
public class AppConfig {

	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}
}
