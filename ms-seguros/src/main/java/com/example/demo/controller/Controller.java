package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.openfeingempleaos.EmpleadosOpenFeing;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/ms-seguros")
public class Controller {
	
	@Autowired
	EmpleadosOpenFeing empleadosOpenFeing;
	
	@CircuitBreaker(name="getRespEmplCircuitBreak", fallbackMethod = "getRespEmplCircuitBreakFallBack")
	@GetMapping
	public ResponseEntity<?> getRespuestaEmp(){
		
		ResponseEntity<?> Cadena = empleadosOpenFeing.responseEntity();
		
		return (ResponseEntity<?>)ResponseEntity.ok("OPERACION OK " + Cadena);

	}
	
	private ResponseEntity<?> getRespEmplCircuitBreakFallBack (RuntimeException e){
		
		return new ResponseEntity<> ("Operacion Incorrecta, No se encuentra Disponible el MS-EMPLEADOS",HttpStatus.OK);
	}

}
