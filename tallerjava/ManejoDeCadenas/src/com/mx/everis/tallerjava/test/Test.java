package com.mx.everis.tallerjava.test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Alan";
		ArrayList<String> array = new ArrayList<String>();
		String nombre2 = new String("Alan");
		if(nombre == nombre2){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		if(nombre.equals(nombre2)){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		String nombreCompleto = "Jorge Alan Fuentes Flores";
		String[] nombre5 = nombreCompleto.split("\\s");
		/**for(int i=0;i<nombre5.length;i++){
			System.out.println(nombre5[i]);
		}
		*/
		String name = nombreCompleto.trim();
		System.out.println("Posicion "+name.indexOf("w"));
		String op = name.valueOf(array);
		System.out.println(op);
	}

}
