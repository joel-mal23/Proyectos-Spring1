package com.circuit.circuitbrake.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "ms-clientes",url= "http://localhost:8088/ms-clientes") //  FEIGN
public interface ClientesFeingClient {
	
	@PostMapping
	String responseEntityPost(); //  FEIGN
	
	
}
