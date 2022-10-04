package com.example.demo.controller;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> 21fd422ccbd9e8e5a3168268e5671fb1ca2ab668
=======
>>>>>>> 21fd422ccbd9e8e5a3168268e5671fb1ca2ab668
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
	
	

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 21fd422ccbd9e8e5a3168268e5671fb1ca2ab668
=======
>>>>>>> 21fd422ccbd9e8e5a3168268e5671fb1ca2ab668
=======
>>>>>>> 21fd422ccbd9e8e5a3168268e5671fb1ca2ab668

}
