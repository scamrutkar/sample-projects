package com.javacase.sagar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramRunner {

	public static void main(String[] args) {

		/*
		 * BeanFactory beanFactory = new XmlBeanFactory( new
		 * FileSystemResource("src/main/resources/spring-config.xml"));
		 */
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Triangle obj = (Triangle) ctx.getBean("triangle");
		obj.draw();
	}

}
