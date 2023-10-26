package Associacao;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        char resp;

        //Referencia para a classe Pessoa
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();

        //dados da Pessoa
        System.out.println("Digite o nome: ");
        p.setNome(sc.next());

        System.out.println("Digite a idade: ");
        p.setIdade(sc.nextInt());

        System.out.println("Digite o sexo (f/n): ");
        p.setSexo(sc.next().charAt(0));

        //dados do endereço
        System.out.println("Digite seu endereço: ");
        end.setLogradouro(sc.next());
        System.out.println("Digite o numero: ");
        end.setNumero(sc.nextInt());

        System.out.println("Tem Complemento? ");
        resp = sc.next().charAt(0);

        if (resp == 's') {
            System.out.println("Digite o complemento: ");
            end.setComplemento(sc.next());
        } else {
            end.setComplemento("");
        }
        System.out.println("Digite o CEP:  ");
        end.setCep(sc.next());
        
        //associacao entre Pessoa e Endereço
        p.setEnd(end);

        System.out.println("Dados da Pessoa: " + p.imprimir());

    }

}
