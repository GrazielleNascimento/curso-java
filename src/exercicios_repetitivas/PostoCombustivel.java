/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_repetitivas;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class PostoCombustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int opcao = sc.nextInt();

        while (opcao != 4) {

            if (opcao == 1) {

                alcool++;
            } else if( opcao == 2) {
                
                gasolina++;
                
            } else if (opcao == 3){
                diesel++;
            }
            
                opcao = sc.nextInt();
            
        }
        System.out.println("Muito Obrigada");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

}
