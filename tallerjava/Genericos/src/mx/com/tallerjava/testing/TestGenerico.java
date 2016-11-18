package mx.com.tallerjava.testing;

import mx.com.tallerjava.genericos.MiGenerico;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiGenerico<Persona> generico = new MiGenerico<Persona>(new Persona());
		generico.print();
		MiGenerico<String> gen2 = new MiGenerico<String>("Alan");
		gen2.print();
		MiGenerico<Float> gen3 = new MiGenerico<Float>(10.5f);
		gen3.print();
	}

}
