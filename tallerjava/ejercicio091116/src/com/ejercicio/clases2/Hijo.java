package com.ejercicio.clases2;

import com.ejercicio.clases.Padre;

public class Hijo extends Padre implements Acciones {

	public Hijo(){
		System.out.println("Hijo");
	}
	public Hijo(String nombre){
		super(nombre);
		//setNombre(nombre);
	}
	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Correr "+getNombre());
	}

	@Override
	public void habar() {
		// TODO Auto-generated method stub
		System.out.println("Hablar "+getNombre());
	}

	@Override
	public void beber() {
		// TODO Auto-generated method stub
		System.out.println("Beber "+getNombre());
		
	}

}
