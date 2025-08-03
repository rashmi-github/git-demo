package com.gitdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello beautiful World!-From Baby Santa");
                System.out.println("Hello again!");

		SpringApplication.run(DemoApplication.class, args);
	}

}
