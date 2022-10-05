package com.circuit.circuitbrake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CircuitBrakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBrakeApplication.class, args);
	}

}
