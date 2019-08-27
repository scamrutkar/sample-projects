package com.javacase.sagar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javacase.sagar.model.Point;

public class SpringCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Point p = context.getBean(Point.class);
		System.out.println(p.toString());

	}

}
