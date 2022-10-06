package com.circuit.circuitbrake.empleadosfeingclient;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "ms-empleados",url= "http://localhost:8486/ms-empleados") //  FEIGN
public interface EmpleadosFeingClient {
	
	@PostMapping
	String responseEntityPost();

}
