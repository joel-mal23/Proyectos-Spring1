package com.circuit.circuitbrake.empleadosfeingclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.circuit.circuitbrake.model.VOEmpleadosFeing;

@FeignClient(name = "ms-empleados",url= "http://localhost:8486/ms-empleados") //  FEIGN
public interface EmpleadosFeingClient {
	
	@PostMapping
	String responseEntityPost();

}
