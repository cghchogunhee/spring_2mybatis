package org.iclass.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisApp {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		
		((AbstractApplicationContext)context).close();
	}
}
