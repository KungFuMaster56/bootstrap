package com.htdf.heating;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.htdf.heating.mapper")
public class HeatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeatingApplication.class, args);
	}
}
