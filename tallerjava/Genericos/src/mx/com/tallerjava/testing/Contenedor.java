package mx.com.tallerjava.testing;

import java.util.Vector;

public class Contenedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector elementos = new Vector();
		elementos.add(10.5f);
		elementos.add(11.8d);
		try{
		for(int i=0; i<elementos.size();i++){
			Float valorTmp =(Float) elementos.get(i);
			System.out.println(valorTmp);
			
		}
		}catch(Exception e){
			e.printStackTrace();
			
		}
			
	}

}
