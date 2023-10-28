package carrinhodecompra;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*  Produto p1 = new Produto(10, "Mouse", 22.0);
        Produto p2 = new Produto(20, "Teclado", 55.0);
        Produto p3 = new Produto(30, "Monitor", 133.0);
        Produto p4 = new Produto(40, "Pen drive", 59.0);
        
        carrinho.addProdutos(p1);
        carrinho.addProdutos(p2);
        carrinho.addProdutos(p3);
        carrinho.addProdutos(p4);
        carrinho.addProdutos(p5);
        carrinho.removeProduto(p4);
        
        System.out.println(carrinho);*/
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        int opcao = 0;

        do {
            System.out.println("\n======Carrinho de Compras=======");
            System.out.println("1 - Adicionar Produtos");
            System.out.println("2- Remover Produtos");
            System.out.println("3- Carrinho");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.print("Código: ");
                int codigo = sc.nextInt();

                System.out.print("Nome: ");
                String nome = sc.next();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                Produto objProduto = new Produto(codigo, nome, preco);

                carrinho.addProdutos(objProduto);

            } else if (opcao == 2) {

                System.out.println("Informe o nome do produto que deseja remover: ");
                String nome = sc.next();

                System.out.println( carrinho.removeProduto(nome));

            } else if (opcao == 3) {
                System.out.println("Produtos: " + "\n" +  carrinho.toString());
               
                System.out.println("Total: R$ " + String.format("%.2f", carrinho.totalPreco()));

            }

        } while (opcao != 4);

        sc.close();

    }

}
