/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Raio {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       
        /* EXEMPLO DA FUNCAO Math.sqrt
        double x = 3.0;

        A = Math.sqrt(x);
        
        System.out.println("Raiz quadrada de " + x + " = " + A)*/

        double raio = sc.nextDouble();
        double pi = 3.14159;
        
        double area = pi * raio * raio;
        
        System.out.printf("AREA = %.4f", area);
        
        sc.close();
        
    }

}
