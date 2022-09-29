package com.example.demo.vo;

public class EmpleadoVO {
	
	private String nombre;
	
	private String apePat;
	
	private int edad;

	public EmpleadoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoVO(String nombre, String apePat, int edad) {
		super();
		this.nombre = nombre;
		this.apePat = apePat;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePat() {
		return apePat;
	}

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
		
		
	
	
	
	

}
