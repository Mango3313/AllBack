package mx.com.everis.tallerjava.arreglos;

import java.util.Random;

public class Arreglo{
	
	public static void main(String[] args) {
		int arregloAsc[]= new int[9];
		Random rd = new Random();
		int randNum;
		
		for(int i = 0; i <arregloAsc.length; i++){
			randNum = rd.nextInt((10-1+1)+1);
			arregloAsc[i] = randNum;
		}
		
		for(int j =0;j<arregloAsc.length;j++){
			System.out.println(arregloAsc[j]);
		}
		try{
			int num = arregloAsc[5];
			double num2 = Double.parseDouble(Integer.toString(num));
			System.out.println(num2);
			boolean doubt = true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
