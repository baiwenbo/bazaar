package com.strive.bazaar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.strive.bazaar.dao")
public class BazaarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazaarApplication.class, args);
	}
}
