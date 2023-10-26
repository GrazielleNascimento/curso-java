package arrays;

import java.util.ArrayList;

/**
 *
 * @author grazi
 */
public class AplicArray {

    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");// a ultima insercao tem maior preferencia agora o Argo nao esta mais na 1 posicao mas na segunda do arrayList

        for (int i = 0; i < carros.size(); i++) {

            System.out.println(carros.get(i));

        }

        // imprimir apenas um elemento especifico 
        // sem mostrar o intervalo completo
        /*    for(String e:carros){
            System.out.println(e);
        }*/
    }

}
