/**
 * @author Jorge
 * @version 0.1
 * */
package com.ejercicio.clases;

public class Padre {
	private String nombre;
	private String apellido;
	
	public Padre(){
		System.out.println("Persona");
	}
	public Padre(String nombre){
		this.setNombre(nombre);
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	
}
