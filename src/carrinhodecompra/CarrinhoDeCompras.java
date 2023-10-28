package carrinhodecompra;

import java.util.ArrayList;

/**
 *
 * @author grazi
 */
public class CarrinhoDeCompras {

    ArrayList<Produto> carrinho = new ArrayList<>();

    public void addProdutos(Produto produto) {
        carrinho.add(produto);
    }

    public String removeProduto(String nome) {

        for (Produto produto : carrinho) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                carrinho.remove(produto);

               return "Produto removido com Sucesso...";
            }
            
        }
        return "Produto não encontrado";

    }

    public double totalPreco() {
        double somaPreco = 0.0;

        for (Produto produto : carrinho) {

            somaPreco += produto.getPreco();
        }

        return somaPreco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Produto produto : carrinho) {
            sb.append("\n" + produto + "\n");

        }
        return sb.toString();
    }
}
