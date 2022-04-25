package com.ichwan.springsql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsqlApplication.class, args);

	}

}
