package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/ms-clientes")
public class Controller {
	 
	
	@PostMapping
	public ResponseEntity<?> responseEntityPost () {
		return new ResponseEntity<>("Respuesta desde ms-cliente", HttpStatus.OK);
		
		}

}