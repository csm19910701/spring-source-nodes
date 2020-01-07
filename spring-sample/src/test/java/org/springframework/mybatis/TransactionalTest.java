package org.springframework.mybatis;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mybatis.config.RunApplicationConfig;
import org.springframework.mybatis.service.CatService;

import java.util.Random;

public class TransactionalTest {

	ApplicationContext applicationContext ;

	@Before
	public void init(){
		applicationContext = new AnnotationConfigApplicationContext(RunApplicationConfig.class);
	}

	@Test
	public void transaction() {
		CatService catService = applicationContext.getBean(CatService.class);
		catService.addCat("admin", new Random().nextDouble(), "陕西红富士大苹果-A1500");
	}

}
