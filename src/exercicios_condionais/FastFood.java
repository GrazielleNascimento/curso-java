/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_condionais;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class FastFood {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtd = sc.nextInt();
        double total;

        if (codigo == 1) {
            total = qtd * 4.0;

        } else if (codigo == 2) {
            total = qtd * 4.5;
        } else if (codigo == 3) {
            total = qtd * 5.0;

        } else if (codigo == 4) {
            total = qtd * 2.0;
        } else {
            total = qtd * 1.5;
        }
        System.out.printf("Total:  R$ %.2f%n",total);
        
        sc.close() ;
    }

}
