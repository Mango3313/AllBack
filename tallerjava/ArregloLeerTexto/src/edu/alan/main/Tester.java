package edu.alan.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
	static final String url = "Files/info.txt";
	static List<String> lista = new ArrayList<String>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		BufferedReader readerFile = new BufferedReader(new FileReader(url));
		StringBuilder st = new StringBuilder();
		String line = readerFile.readLine();
		while(line != null){
			st.append(line);
			lista.add(line);
			st.append(System.lineSeparator());
			line = readerFile.readLine();
		}
		int c =0;
		Collections.reverse(lista);
		String[] arreglo = new String[lista.size()];
		arreglo =lista.toArray(arreglo);
		for(String s: arreglo){
			c++;
			System.out.println(""+c+".- "+s);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
