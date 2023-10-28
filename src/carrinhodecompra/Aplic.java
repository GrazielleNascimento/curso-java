package carrinhodecompra;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto(10, "Mouse", 22.0);
        Produto p2 = new Produto(20, "Teclado", 55.0);
        Produto p3 = new Produto(30, "Monitor", 133.0);
        Produto p4 = new Produto(40, "Pen drive", 59.0);

        System.out.print("Código: ");
        int codigo = sc.nextInt();

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Produto p5 = new Produto(codigo, nome, preco);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.addProdutos(p1);
        carrinho.addProdutos(p2);
        carrinho.addProdutos(p3);
        carrinho.addProdutos(p4);
        carrinho.addProdutos(p5);

        carrinho.removeProduto(p4);
        System.out.println(carrinho);
         System.out.println("Total: R$ " + String.format("%.2f", carrinho.totalPreco()));
        
        sc.close();

    }

}
