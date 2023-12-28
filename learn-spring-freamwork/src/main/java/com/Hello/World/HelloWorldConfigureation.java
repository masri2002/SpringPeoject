package com.Hello.World;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name ,int age ,Address address) {};
record Address(String firstline ,String city) {};
@Configuration
public class HelloWorldConfigureation {
     @Bean
	public String name() {
	return "ahmad";
}
     @Bean
 	public int age() {
 	return 9;
 }
     @Bean
     public Person person(){
    	 return new Person("Ali", 12 ,new Address("Al Makbara Str", "Amman")); 
     }
     @Bean
     public Person person2MethodCall(){
    	 return new Person(name() ,age() ,address()); 
     }
     @Bean
     public Person person3Parameters(String name ,int age ,Address address3){//name  , age  , address2
    	 return new Person(name , age , address3 ); 
     }
     @Bean
     @Primary
     public Person person4Parameters(String name ,int age ,Address address){//name  , age  , address2
    	 return new Person(name , age , address ); 
     }
     @Bean
     public Person person5Qualifier(String name ,int age ,@Qualifier("address2")Address address2){//name  , age  , address2
    	 return new Person(name , age , address2 ); 
     }
     @Bean(name = "address2")
     @Qualifier("address2")
     public Address address(){
    	 return new Address("Hakeem Ben Jableh ,Str", "Az zarqa"); 
     }
     @Bean(name = "address3")
     public Address address3(){
    	 return new Address("Ahmad Ibn Hanbel ,Str", "Az Zarqa"); 
     }
     @Bean(name = "address4")
     @Primary
     public Address address4(){
    	 return new Address("Ahmad Ibn Hanbel ,Str", "Az Zarqa"); 
     }
}
