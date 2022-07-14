package com.yash.injectnamestobean;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yash.injectnamestobean")
public class ConfigurationClassName {
	
	@Bean
	public NameClass nameClass()
	{
		NameClass nc=new NameClass();
		System.out.println("Bean class");
		nc.setName1("Manish");
		nc.setName2("Anshul");
		nc.setName3("Amit");
		nc.setName4("Gurvinder");
		nc.setName5("Ram");
		return nc;
	}

}
