package com.mx.everis.tallerjava.Test;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Jorge Alan Fuentes Flores";
		System.out.println("Nombre: "+nombre);
		Random rd = new Random();
		int rndNum = rd.nextInt((29-4)+1)+4;
		String num = ""+rndNum;
		String nuevo = nombre.replaceAll("\\s", num);
		System.out.println("Nombre: "+nombre);
		System.out.println("Sustitucion: "+nuevo);
	}

}
