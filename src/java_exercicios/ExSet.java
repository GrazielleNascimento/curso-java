package java_exercicios;

import java.util.HashSet;

public class ExSet {

	public static void main(String[] args) {
		
		HashSet<String> carros = new HashSet<String>();
		
		carros.add("Polo");
		carros.add("Golf");
		carros.add("City");
		carros.add("Cruze");
		carros.add("HRV");
		carros.add("Polo");
		carros.add("HRV");
		
		
		System.out.println(carros);
		
		

	}

}
