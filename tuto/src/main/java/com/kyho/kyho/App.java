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
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext();
    	
    	Car car = new Car();
    	car.drive();
    	
    	Bike bike = new Bike();
    	bike.drive();
    	
    	Vehicle obj1 = new Car();
    	Vehicle obj2 = new Bike();
    	
    	obj1.drive();
    	obj2.drive();
    	
    	
    	Vehicle obj3 = (Vehicle)context.getBean("Vehicle");
    	obj3.drive();
    	
      
    }
}
