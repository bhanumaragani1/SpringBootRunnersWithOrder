package com.starter.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AppRunner4 implements ApplicationRunner,Ordered {

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("from AppRunner4");		
	}

}
