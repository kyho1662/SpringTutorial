package com.kyho.kyho;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	

    	
    	
    	Vehicle obj3 = (Vehicle)context.getBean("car");
    	obj3.drive();
    	
//    	Tire t = (Tire)context.getBean("tire");
//    	System.out.println(t);
//    	
    	
      
    	
    	
    }
}
