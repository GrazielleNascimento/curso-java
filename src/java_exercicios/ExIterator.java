package java_exercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class ExIterator {

	public static void main(String[] args) {

		ArrayList<String> carros = new ArrayList<String>();

		carros.add("Polo");
		carros.add("Golf");
		carros.add("City");
		carros.add("Cruze");
		carros.add("HRV");
		carros.add("Polo");
		carros.add("HRV");
		carros.add("Argo");
		carros.add("Ka");

		System.out.println(carros);

		Iterator<String> it = carros.iterator();
		while (it.hasNext()) {
			String carro = it.next();
			if(carro == "Argo") {
				it.remove();
			}

		}
		System.out.println(carros);

	}

}
