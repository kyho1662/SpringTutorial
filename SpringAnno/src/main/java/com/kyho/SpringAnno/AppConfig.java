package com.kyho.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Dependency Injector :   @Configuration

@Configuration
@ComponentScan(basePackages="com.kyho.SpringAnno") // all components in package
public class AppConfig {

//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}
}
