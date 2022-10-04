package com.circuit.circuitbrake.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/circuitBrakeMicro")
public class Controller {
	
	@CircuitBreaker(name="getOneObjetos", fallbackMethod = "getOneFallback")
	@GetMapping("/getOne")
	public ResponseEntity<?> getMetodoOne (){
		
		//return (ResponseEntity<?>) ResponseEntity.ok("ok"); 
		return (ResponseEntity<?>) ResponseEntity.badRequest();
	}
	
	@CircuitBreaker(name="getAllObjetos", fallbackMethod = "getAllFallback")
	@GetMapping("/getAll")
	public ResponseEntity<?> getMetodoAll(){
		
		
			return new ResponseEntity<> ("Get Objetos VO ", HttpStatus.OK);

	}
	
	
	//Se escriben los metodos Fallbackś
	
	private ResponseEntity<?> getOneFallback (RuntimeException e){ //se solicita que se retorne la excepcion
		
		return new ResponseEntity<> ("La consulta por 'One' no se encuentra disponible",HttpStatus.OK);
		
	}
	
    private ResponseEntity<?> getAllFallback (RuntimeException e){ //se solicita que se retorne la excepcion
		
		return new ResponseEntity<> ("La consulta por 'All' no se encuentra disponible",HttpStatus.OK);
		
	}
	
	
	

}
