package com.circuit.circuitbrake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.circuit.circuitbrake.empleadosfeingclient.EmpleadosFeingClient;
import com.circuit.circuitbrake.feignclient.ClientesFeingClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

/*
 * 5.- Se inyecta el objeto del cliente consumible
 * 6.- Se invoca el objeto y metodo de la interfas FEIGN
 */

@RestController
@RequestMapping("/circuitBrakeMicro")
public class Controller {
	
	@Autowired
	ClientesFeingClient clientesFeingClient; // 5.- Se inyecta el objeto de la insterfaz: FEIGN
	
	@Autowired
	EmpleadosFeingClient empleadosFeingClient; 
	
	@CircuitBreaker(name="getOneObjetos", fallbackMethod = "getOneFallback")
	@GetMapping("/getOne")
	public ResponseEntity<?> getMetodoOne (){
		
		String Cadena = clientesFeingClient.responseEntityPost(); // 6.- Se invoca el objeto y metodo de la interfas FEIGN 
		
		return (ResponseEntity<?>) ResponseEntity.ok("OPERACION OK " + Cadena);  
		//return (ResponseEntity<?>) ResponseEntity.badRequest();
	}
	
	@CircuitBreaker(name="getAllObjetos", fallbackMethod = "getAllFallback")
	@GetMapping("/getAll")
	public ResponseEntity<?> getMetodoAll(){
		
		String Cadena = empleadosFeingClient.responseEntityPost();
		
		
			return (ResponseEntity<?>) ResponseEntity.ok("Get Objetos VO " + Cadena);

	}
	
	
	//Se escriben los metodos Fallbackś CIRCUIT-BRAKE
	
	private ResponseEntity<?> getOneFallback (RuntimeException e){ //se solicita que se retorne la excepcion
		
		return new ResponseEntity<> ("OPERACION INCORRECTA, no se encuentra disponible el julanito microservicio",HttpStatus.OK);
		
	}
	
    private ResponseEntity<?> getAllFallback (RuntimeException e){ //se solicita que se retorne la excepcion
		
		return new ResponseEntity<> ("La consulta por 'All' no se encuentra disponible",HttpStatus.OK);
		
	}
    
    
	
	
	

}
