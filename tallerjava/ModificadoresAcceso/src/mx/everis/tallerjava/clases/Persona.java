package mx.everis.tallerjava.clases;

public class Persona {
	private String nombre;
	private String apelido;
	private int edad;
	protected void caminar(){
		System.out.println(nombre +" esta corriendo");
	}
	public void comer(){
		System.out.println(nombre+" esta ciuendo");
	}
	public void beber(){
		System.out.println(nombre+" Esta bebiendo");
	}
}
