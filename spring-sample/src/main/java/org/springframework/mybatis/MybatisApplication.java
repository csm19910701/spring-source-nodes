package org.springframework.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mybatis.config.RunApplicationConfig;

public class MybatisApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RunApplicationConfig.class);
		System.out.println(applicationContext.getApplicationName());
	}

}
