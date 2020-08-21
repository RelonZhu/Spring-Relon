package com.relon.spring;

import com.relon.spring.config.AppConfig;
import com.relon.spring.domain.ClassA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		ClassA classA = (ClassA)context.getBean("classA");
		classA.setName("zhangsan");
		System.out.println(classA.getName());
	}
}
