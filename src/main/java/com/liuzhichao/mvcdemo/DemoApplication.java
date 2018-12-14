package com.liuzhichao.mvcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描Mapper类所在的包,将包下的类当作Mapper类交给Spring容器管理
//避免了给每一个Mapper类添加@Mapper注解
@MapperScan("com.liuzhichao.mvcdemo.mapper")
public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoApplication.class, args);
	}

}

/**
 * ComponentScan是组件扫描,主要包括Controller,Service,Responsitory
 * MapperScan是扫描Mapper类的注解,不用在每个Mapper类上添加Mapper注解
 */
