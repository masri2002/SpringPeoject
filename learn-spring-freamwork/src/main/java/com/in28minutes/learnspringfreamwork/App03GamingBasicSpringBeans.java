package com.in28minutes.learnspringfreamwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringfreamwork.game.Gamerunner;
import com.in28minutes.learnspringfreamwork.game.GamingConsol;

public class App03GamingBasicSpringBeans {

	public static void main(String[] args) {
     try(var context =new AnnotationConfigApplicationContext(GamingConfigureation.class)){
    	 
    	 context.getBean(GamingConsol.class).up();
    	 context.getBean(Gamerunner.class).run();
    	 context.getBean("gamerunner2");
    	 
    	 
    	 
    	 
     }catch (Exception ex) {
    	 System.out.println(ex);
     }
	}

}
