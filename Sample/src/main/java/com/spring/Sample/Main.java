package com.spring.Sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Sample.modelo.Configpp;
import com.spring.Sample.modelo.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p=new Persona();
		 ApplicationContext app= new AnnotationConfigApplicationContext(Configpp.class);
	
		 p=(Persona) app.getBean("persona");
		System.out.println(p.toString());
		((ConfigurableApplicationContext)app).close();
		
	}

}
