package com.spring.Sample.modelo;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configpp {

	@Bean
	public Persona persona(){
		return new Persona(12, "cherto", 12, new Trago());
	}
	
	
	
}
