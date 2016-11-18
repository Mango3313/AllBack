package mx.com.everis.tallerjava.testing;

import mx.com.everis.tallerjava.clases.Persona;

public class Testing extends Persona {
	public static void main(String[] args) {
		Persona pa = new Persona();
		
		System.out.println(pa.nombre);
		pa.nombre ="Jorgesssss";
		System.out.println(pa.nombre);
		Persona pb = new Persona();
		
		System.out.println(pb.nombre);
		pb.nombre="Pedro";
		System.out.println(pb.nombre);
		
		// TODO Auto-generated method stub

	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	public static int sumar(){
		return 0;
	}
}
