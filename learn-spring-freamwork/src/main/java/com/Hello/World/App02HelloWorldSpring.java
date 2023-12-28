package com.Hello.World;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
    try(var Context = 
    		new AnnotationConfigApplicationContext
    		(HelloWorldConfigureation.class))//1:launch a Spring context 
		 {
			//Retrieving beans managed by Spring 	
			System.out.println(Context.getBean("name"));
			System.out.println(Context.getBean("age"));
			System.out.println(Context.getBean("person"));
			System.out.println(Context.getBean("person2MethodCall"));
			System.out.println(Context.getBean("person3Parameters"));
			System.out.println(Context.getBean("address2"));
			System.out.println(Context.getBean(Person.class));
			System.out.println(Context.getBean(Address.class));
			System.out.println(Context.getBean("person5Qualifier"));
			//list all beans names 
			Arrays.stream(Context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
