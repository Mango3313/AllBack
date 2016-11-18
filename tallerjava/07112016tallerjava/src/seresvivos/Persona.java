package seresvivos;

public class Persona {
	/*
	 * Nombre, apellido, edad
	 * Clase - persona
	 * Atributos - Nombre, apellido, edad
	 * metodos: caminar(), comer(), beber().
	 * Objeto
	 * Instancia
	 * private, protected, default - package, public, 4 modificadores de acceso.
	 * palabra reservada: 
	 * */
	private String nombre;
	private String apellido;
	private int edad;
	
	public void caminar(){
		System.out.println(nombre +" esta corriendo");
	}
	public void comer(){
		System.out.println(nombre+" esta ciuendo");
	}
	public void beber(){
		System.out.println(nombre+" Esta bebiendo");
	}
	public static void main(String args[]){
		Persona p = new Persona();
		p.nombre = "Gustavo";
		p.apellido="Sanchez";
		p.edad=15;
		p.caminar();
		p.comer();
		p.beber();
		
	}
}
