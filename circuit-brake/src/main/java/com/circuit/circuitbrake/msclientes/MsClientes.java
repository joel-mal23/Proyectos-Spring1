package com.circuit.circuitbrake.msclientes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/ms-clientes")
public interface MsClientes {
	
	//Metodo del controller del Micro al que se consumira
	
	@PostMapping
	public ResponseEntity<?> responseEntityPost ();

}
