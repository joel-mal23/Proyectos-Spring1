package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.EmpleadoVO;
import com.example.demo.vo.VipEmpleados;

@RestController
@RequestMapping("/ms-empleados")
public class controller {
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Value("${eureka.client.fetch-registry}")
	private boolean serverPort;
	
	
	
	
	@GetMapping("/empl")
	public ResponseEntity<?> responseEntity (){
		
		return new ResponseEntity<>( new VipEmpleados("Joel", "Malvaez", "Elizalde",29), HttpStatus.OK);
	
	}
	
	@PostMapping
	public ResponseEntity<?> responseEntityPost () {
		
		if(serverPort)
		{
			
			return new ResponseEntity<>(new EmpleadoVO("joel","ApellidoP",12), HttpStatus.OK);
		
		}
		
		return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
		
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
