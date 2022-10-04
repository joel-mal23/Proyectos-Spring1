package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/ms-clientes")

public class Controller {
	
	@GetMapping("/cli")
	public ResponseEntity<?> responseEntity(){
		
	
		return new ResponseEntity<>("VO Clientes", HttpStatus.OK);
	}	
	
	


}
