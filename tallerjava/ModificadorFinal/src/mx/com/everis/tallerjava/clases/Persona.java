package mx.com.everis.tallerjava.clases;

public  class Persona {
	public static String nombre="ey";
	public Persona(){
		//nombre = "ey";
	}
	public void setNombre(String nombre){
		//this.nombre = nombre;
		
	}
	/**
	 * Modificador de no acceso final se aplica para: clases, metodos y variables
	 * Reglas:
	 * 1) Si una clase es final no tendra subclases y no se podra heredar
	 * 2) Si un metodo es final no podra ser sobreescrito
	 * 3) Si una variable es final no podra ser asignada por segunda vez
	 * */
	
	/**
	 * El modificador de no acceso abstrac se aplica para: clases, metodos e interfaces
	 * Reglas:
	 * 1) Una clase es abstracta no se podra instancia
	 *   1.1) Una clase abstracta puede contener metodos abstractos y no abstractos
	 *   1.2) Una clase abstracta puede heredar d euna clase abstract
	 *   1.3)Una clase abstracta puede heredar d euna clase no abstract
	 *   1.4)Una clase concreta es la encargad de implementar los metodos de una clase abstracta
	 *   1.5) Una clase concreta solo puede contener metodos no abstractos
	 * 2) Los metodos abstractos soo se definen. 
	 * 3) Las interfaces por default son abstractas.
	 * */
	public String getNombre(){
		return null;
		
	}
	/**
	 * El modificador static se aplica para: metodos y variables
	 * Reglas:
	 * 1) Las variables static se pueden acceder a nivel de clase
	 * 2) Las variables no-static solo se podran acceder a traves de una instancia
	 * 3) para utiizar un metodo no estatico no se necesita instanciar
	 * */

}
