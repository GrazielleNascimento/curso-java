package LivroLivrariaArrayListStatic;

import java.util.ArrayList;

/**
 *
 * @author grazi
 */
public class Acervo {

    private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

    //metodo GET
    public static ArrayList<LivroLivraria> getListaLivros() {
        return listaLivros;
    }

    //Adicionar um obj na lista    
    static public void adicionar(LivroLivraria livro) {
        listaLivros.add(livro);
    }

    //lista os dados de todos os objetos da lista
    static public String listar() {
        String saida = "";
        int i = 1;
        for (LivroLivraria livro : listaLivros) {
            saida += "\n====== Livro Nº " + (i++) + "======\n";
            saida += livro.imprimir() + "\n";
        }

        return saida;
    }

    //Pesquisar por genero
    static public int pesquisar(String genero) {
        int qtd = 0;

        for (LivroLivraria livro : listaLivros) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                qtd++;
            }
        }

        return qtd;
    }

    //Pesquisar por faixa de preco
    static public int pesquisar(double vInicial, double vFinal) {
        int qtd = 0;

        for (LivroLivraria livro : listaLivros) {
            if (livro.getPreco() >= vInicial && livro.getPreco() <= vFinal) {
                qtd++;
            }
        }
        return qtd;
    }

    //Remover um livro pelo titulo
    static public boolean remover(String titulo) {
        for (LivroLivraria livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                listaLivros.remove(livro);
                return true;
            }

        }
        return false;
    }

    //TOTAL ACERVO
    static double calcularTotalAcervo() {
        double total = 0;

        for (LivroLivraria livro : listaLivros) {
            total += livro.getPreco();
        }

        return total;

    }
}
