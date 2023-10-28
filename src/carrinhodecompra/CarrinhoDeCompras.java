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

    public void removeProduto(Produto produto) {
        carrinho.remove(produto);
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
