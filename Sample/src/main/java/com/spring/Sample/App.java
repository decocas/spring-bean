package com.spring.Sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Sample.modelo.Persona;
import com.spring.Sample.modelo.Trago;
 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext app= new ClassPathXmlApplicationContext("com/file/bean.xml");
       
    	Persona p=new Persona();
    	Trago trago=new Trago();
    	p=(Persona) app.getBean("alias");
    	
    	trago=(Trago) app.getBean("trago");
    	
    	System.out.println( "Hello World! " + p.toString()+" "+trago.getNombre());
    	 //sin esta linea el bean no s destruye
    	((ConfigurableApplicationContext)app).close();
    	
    }
}
