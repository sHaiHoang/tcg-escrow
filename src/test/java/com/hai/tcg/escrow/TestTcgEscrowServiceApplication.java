package com.hai.tcg.escrow;

import org.springframework.boot.SpringApplication;

public class TestTcgEscrowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(TcgEscrowServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
