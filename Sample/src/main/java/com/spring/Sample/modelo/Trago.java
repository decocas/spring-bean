package com.spring.Sample.modelo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Trago implements InitializingBean, DisposableBean{
	
	 private int id;
	 private String nombre;
	 
	 public Trago() {
		// TODO Auto-generated constructor stub
		 	this.id=0;
		 	this.nombre="calua";
	 }
	 public void setId(int id) {
			this.id = id;
		}
	 public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
	 public int getId() {
		return id;
	}
	 
	 public String getNombre() {
		return nombre;
	}
	 /*public void begin() {
			System.out.println("inicio"+toString());
		}
		
		public void end() {
			System.out.println("fin"+toString());
		}*/
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("fin"+toString());
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inicio"+toString());
	}
	 
	 
}
