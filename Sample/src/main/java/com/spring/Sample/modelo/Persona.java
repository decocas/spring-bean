package com.spring.Sample.modelo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona {
	
	
	private int id;
	private String name;
	private int edad;
	private Trago t; 
	//private List<Trago> t;

	public Persona() {
		// TODO Auto-generated constructor stub
	this.id=1;
	this.name="charo";		
	this.edad=1;
	this.t=new Trago();
	
	}
	
	
		
	public Persona(int id, String name, int edad, Trago t  ) {
		
		this.id = id;
		this.name = name;
		this.edad = edad;
		this.t = t;
	}
	@PostConstruct
	public void begin() {
		System.out.println("inicio");
	}
	@PreDestroy
	public void end() {
		System.out.println("fin");
	}
	

	public void setT(Trago t) {
		this.t = t;
	}
	
	public Trago getT() {
		return t;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/*public List<Trago> getT() {
		return t;
	}


	public void setT(List<Trago> t) {
		this.t = t;
	}*/
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId()+" "+this.getName()+" "+this.getEdad()+" y me gusta el "+this.getT().getNombre();
	}


	
	

}
