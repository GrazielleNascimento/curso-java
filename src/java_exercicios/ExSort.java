package java_exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExSort {

	public static void main(String[] args) {
		
		List<String> mangas = new ArrayList<String>();
		
		mangas.add("Pokemon");
		mangas.add("Berserk");
		mangas.add("Attack on Titan");
		mangas.add("Hellsing Ultimate");
		mangas.add("Dragon Ball Z");
		
		Collections.sort(mangas);//ordenar por ordem alfabetica
		
		System.out.println(mangas); //imprimi tipo lista
		
		for(String manga : mangas) { // imprimi um por um
			System.out.println(manga);
		}
		
		List<Double> dinheiros = new ArrayList<Double>();
		
		dinheiros.add(100.21);
		dinheiros.add(23.98);
		dinheiros.add(21.21);
		dinheiros.add(98.10);
		dinheiros.add(125.78);
		
		System.out.println(dinheiros);// sem ordenação
		Collections.sort(dinheiros);
		
		System.out.println(dinheiros);//com ordenaçao

	}

}
