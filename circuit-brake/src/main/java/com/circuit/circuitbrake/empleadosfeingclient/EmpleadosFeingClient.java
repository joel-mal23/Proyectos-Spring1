package com.circuit.circuitbrake.empleadosfeingclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.circuit.circuitbrake.model.VOEmpleadosFeing;

@FeignClient(name = "ms-empleados",url= "http://localhost:8486/ms-empleados") //  FEIGN
public interface EmpleadosFeingClient {
	
	@GetMapping
	String responseEntity();

}
