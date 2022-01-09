package com.test.git.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = { "com.test.git.*" })
//@ComponentScan("com.test.git")
public class GitTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitTestAppApplication.class, args);
	}

}
