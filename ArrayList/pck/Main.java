package pck;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Ant�nio");
		lista.add("N�bia");
		
		for(int i = 0; i < lista.size(); i++ ) {
			System.out.println(lista.get(i));
		}
		
		for(String item: lista) {
			System.out.println(item);
		}
		
	}
	
}