package arrays;

import java.util.ArrayList;

/**
 *
 * @author grazi
 */
public class AplicClientes {

    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList<String>();

        clientes.add("Rebeca");
        clientes.add("Perla");
        
        // Metodos e conceitos do ArrayList
        
       // System.out.println(clientes.indexOf("Rebeca")); -- retorna a posicao do item no array
       // System.out.println(clientes.size()); --- mostra a qtd de itens no array
       // System.out.println(clientes.contains("Aline")); --- testa se determinado item esta no array
        //System.out.println(clientes.isEmpty()); ---- pergunta se o array esta vazio
        //System.out.println(clientes.get(0)); --- mostrar pelo indice
        //clientes.remove(1); ----remover apartir do indice
        //clientes.clear(); ------ remove tudo
        //System.out.println(clientes.toString()); ---- mostra todos itens do array
    }

}
