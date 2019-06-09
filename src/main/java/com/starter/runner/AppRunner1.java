package com.starter.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AppRunner1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("from AppRunner1");
	}

}
