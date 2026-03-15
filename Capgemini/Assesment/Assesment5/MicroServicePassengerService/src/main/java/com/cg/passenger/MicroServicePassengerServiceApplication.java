package com.cg.passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroServicePassengerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicePassengerServiceApplication.class, args);
	}

}
