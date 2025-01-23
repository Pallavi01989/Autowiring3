package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc= new ClassPathXmlApplicationContext("bean.xml");
		
        Student stu = (Student) apc.getBean("c");
        
        System.out.println(stu);
        
        
        
	}

}
