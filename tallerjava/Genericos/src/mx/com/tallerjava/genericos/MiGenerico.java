package mx.com.tallerjava.genericos;

public class MiGenerico<E> {
	public E valor;
	public MiGenerico(E valor){
		this.valor = valor;
	}
	public void print(){
		System.out.println("Valor:  "+valor);
	}

}
