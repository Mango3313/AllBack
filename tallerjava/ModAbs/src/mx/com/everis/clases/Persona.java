package mx.com.everis.clases;

import mx.com.everis.interfaces.MiInterface;

abstract public class Persona extends Persona2 implements MiInterface{
	/**
	 * Clase abstracta puede tener metodos abstractos y no abstractos
	 * Clase concreta solo puede tener metodos no abstractos
	 * El modificador de no acceso abstract, solo se aplica para clases, interfaces y metodos
	 * */
	
	public Persona(){
		
	}
	/**
	 * Metodo abstracto
	 * */
	public abstract String getNombre();
	/**
	 * Metodo no abstracto
	 * @return
	 * */
	public void setNombre(){
		//Cuerpo :v
	}
}
