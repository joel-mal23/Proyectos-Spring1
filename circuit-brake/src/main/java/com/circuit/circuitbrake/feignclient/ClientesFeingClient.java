package com.circuit.circuitbrake.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * Se crea en el Micro Consumidor:
 * 1.- Se inyecta la propiedad Feing al pom
 * 2.-Un paquete que referencie al Micro Consumible
 * 3.- Se Crea una interfaz con la @notacion de Feign
 * 4.- Se coloca el metodo del cliente
 */


@FeignClient(name = "ms-clientes",url= "http://localhost:8088/ms-clientes") //  FEIGN
public interface ClientesFeingClient {
	
	@PostMapping
	String responseEntityPost(); //  FEIGN
	
	
}
