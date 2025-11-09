package com.hai.tcg.escrow;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TcgEscrowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcgEscrowServiceApplication.class, args);
	}

	@RestController
	public class HelloController {
		
		@GetMapping("/hello")
		public String index() {
			return "Hello world!";
		}
	}

}
