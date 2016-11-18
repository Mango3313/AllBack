package mx.com.tallereveris.Testing;

import java.util.ArrayList;
import java.util.List;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombre = new ArrayList<String>();
		nombre.add("Alan");
		nombre.add("meh");
		nombre.add("muu");
		System.out.println(nombre.size());
		List<String> apellidos = new ArrayList<String>();
		apellidos.add("Fuentes");
		apellidos.add("meeeh");
		apellidos.add("muuu");
		System.out.println(apellidos.size());
		if(apellidos.contains("Fuentes")){
			System.out.println("Lo contiene");
		}else{
			System.out.println("No lo contiene");
		}
		for(String s: nombre){
			System.out.println(s);
		}
		for(String a: apellidos){
			System.out.println(a);
		}
	}

}
