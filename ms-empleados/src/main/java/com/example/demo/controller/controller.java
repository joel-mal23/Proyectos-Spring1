package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-empleados")
public class controller {
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Value("${eureka.client.fetch-registry}")
	private boolean serverPort;
	
	
	
	
	@GetMapping("/empl")
	public ResponseEntity<?> responseEntity (){
		
		return new ResponseEntity<>(("Empleados"), HttpStatus.OK);
	
	}
	
	@PostMapping
	public ResponseEntity<?> responseEntityPost () {
		
		return new ResponseEntity<>("Respuesta desde ms-empleados", HttpStatus.OK);

		}
	
	
	@GetMapping("/error")
	private ResponseEntity<?> responseEntityError () {
		
		if (!serverPort)
		{
		return new ResponseEntity<> ("Error", HttpStatus.CONFLICT); 
		}
		
		return new ResponseEntity<> ("Exito", HttpStatus.OK);
	}

}
