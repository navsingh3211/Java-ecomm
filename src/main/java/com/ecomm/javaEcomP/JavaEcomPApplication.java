package com.ecomm.javaEcomP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaEcomPApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JavaEcomPApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
