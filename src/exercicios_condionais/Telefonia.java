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
public class Telefonia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        int minutos = sc.nextInt();

        double conta = 50.0;

        if (minutos > 100) {

           // conta = conta + (minutos - 100) * 2.0;
              conta += (minutos - 100) * 2.0;

        }
        System.out.printf("Valor a pagar: R$ %.2f" , conta);
        
        sc.close();

    }

}
