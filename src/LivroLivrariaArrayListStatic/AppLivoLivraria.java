package LivroLivrariaArrayListStatic;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class AppLivoLivraria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        int menu;
        double vInicial, vFinal;

        //referencia para a classe LivroLivraria
        LivroLivraria objLivro;

        String titulo, autor, genero;
        float preco;
        int isbn;

        do {
            exibirMenu();
            menu = sc.nextInt();

            switch(menu)
            {

            //cadastro do livro
             case 1:
                 System.out.println("====> Cadastrar Livro");
                 
                 System.out.println("Digite o titulo: ");
                 titulo = scString.nextLine();
                 System.out.println("Digite o autor: ");
                 autor = scString.nextLine();
                 System.out.println("Digite o genero: ");
                 genero = scString.nextLine();
                 System.out.println("Digite o ISBN: ");
                 isbn = sc.nextInt();
                 System.out.println("Digite o preço: ");
                 preco = sc.nextFloat();
                 
                 objLivro = new LivroLivraria(titulo, autor, isbn, genero, preco);
                 
                 //guardar no ArrayList
                 Acervo.adicionar(objLivro);
         
                break;
             case 2:
                 System.out.println("====> Listagem de Livros ");
                 System.out.println(Acervo.listar());
                break;
             case 3:
                 System.out.println("====> Exclusão do Livro ");
                 System.out.println("Digite o titulo do livro: ");
                 titulo = scString.nextLine();
                 
                 if( ! (Acervo.getListaLivros().isEmpty())){ //acervo nao vazio (posso remover livros)
                     if(Acervo.remover(titulo)){
                         System.out.println("Livro removido com sucesso");
                     }
                     else{
                         System.out.println("Não existem Livros no Acervo!!");
                     }
                 }
                 else{
                     System.out.println("Não existem livros no Acervo!!");
                 }
                break;                              
             case 4:
                 System.out.println("====> Pesquisar pelo Genero ");
                 System.out.println("Digite o genero: ");
                 genero = scString.nextLine();
                 System.out.println("Existem " + Acervo.pesquisar(genero) 
                         + " Livro(s) do genero " + genero);
                break;               
             case 5:
                  System.out.println("====>Pesquisar por faixa de Preço");
                  System.out.println("Digite a faixa Inicial e a Final: ");
                  vInicial = sc.nextDouble();
                  vFinal = sc.nextDouble();
                  
                  System.out.printf("Existem " + Acervo.pesquisar(vInicial, vFinal) 
                         + " Livro(s) com o preço entre " 
                          +  String.format("R$ %.2f e R$ %.2f \n",vInicial, vFinal));
                 
                break; 
             case 6:
                 System.out.println("====> Total em R$ de livros no Acervo");
                 System.out.println("O Total é: " 
                         + String.format("R$ %.2f ", Acervo.calcularTotalAcervo()));
                break;
             case 7: 
                 System.out.println("Saindo...");
                 break;
                default:
                System.out.println("Opcao de Menu invalido");
        }
            
        }while(menu != 7);

    }//fim main

    static void exibirMenu() {
        System.out.println("========= LIVRO LIVRARIA ========");
        System.out.println("1- CADASTRAR");
        System.out.println("2- LISTAR");
        System.out.println("3- EXCLUIR LIVRO");
        System.out.println("4- PESQUISAR POR GENERO");
        System.out.println("5- PESQUISAR POR FAIXA DE PREÇO");
        System.out.println("6- CaLCULAR TOTAL DO ACERVO");
        System.out.println("7- SAIR");
        System.out.println("Escolha uma opção: ");

    }

}
