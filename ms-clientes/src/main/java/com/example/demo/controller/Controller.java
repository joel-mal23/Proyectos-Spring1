package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-clientes")
public class Controller {
	
	@GetMapping("/cliDatos")
	public ResponseEntity<?> responseEntity (){
		
		return new ResponseEntity<>("VO Datos Clientes", HttpStatus.OK);
		
		
	}

}
