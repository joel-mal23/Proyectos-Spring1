package com.example.demo.openfeingempleaos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ms-empleados",url = "http://localhost:8486/ms-empleados")
public interface EmpleadosOpenFeing {
	
	@GetMapping("/empl")
	public String responseEntity();	

}
