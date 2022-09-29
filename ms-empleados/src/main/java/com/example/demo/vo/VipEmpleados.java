package com.example.demo.vo;

public class VipEmpleados {
	
	
	private String nombre;
	
	private String apePat;
	
	private String apeMat;
	
	private int NumEmpleado;
	
	// 1ro Por buena practica 1ro se generan el contructor desde la SuperClase 

	public VipEmpleados() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 2do En segundo lugar se genera el constructor con las variables 
	
	public VipEmpleados(String nombre, String apePat, String apeMat, int numEmpleado) {
		super();
		this.nombre = nombre;
		this.apePat = apePat;
		this.apeMat = apeMat;
		NumEmpleado = numEmpleado;
	}
	
	// 3ro En tercer paso se genera los gettets and setters de las variables

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

	public String getApeMat() {
		return apeMat;
	}

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}

	public int getNumEmpleado() {
		return NumEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		NumEmpleado = numEmpleado;
	}
	
	
	

	
	
}
