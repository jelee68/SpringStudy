package com.wind.s06;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Family family() {
		Family family = new Family("그레고리펙", "오드리햅번");
		family.setBrotherName("발리");
			
		return family;
	}
	
}
