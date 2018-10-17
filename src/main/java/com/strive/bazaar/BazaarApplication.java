package com.strive.bazaar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication
@MapperScan("com.strive.bazaar.dao")
public class BazaarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazaarApplication.class, args);
	}
}
