/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_condionais;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Intervalos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        System.out.println("Digite um numero: " + num);
        
        if( num < 0 || num > 100) {
            System.out.println("Fora do Intervalo");
        }

        else if ( num <= 25) {

            System.out.println("INTERVALO [0,25]");

        } else if (num <= 50){
            System.out.println("INTERVALO (25,50]");
        }
        else if (num <= 75){
            System.out.println("INTERVALO (50,75");
        }
        else { 
            System.out.println("INTERVALO (75,100]");
        }
            
        sc.close();
            

    }

}
