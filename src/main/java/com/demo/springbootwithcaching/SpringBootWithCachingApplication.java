package com.demo.springbootwithcaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootWithCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithCachingApplication.class, args);
	}
}
