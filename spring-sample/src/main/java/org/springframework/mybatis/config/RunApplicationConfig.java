package org.springframework.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAspectJAutoProxy
@EnableTransactionManagement
@MapperScan("org.springframework.mybatis.mapper")
@ComponentScan("org.springframework.mybatis")
public class RunApplicationConfig {



}
