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
public class Peca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorUni1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorUni2 = sc.nextDouble();

        double calc = valorUni1 * numPecas1 + valorUni2 * numPecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", calc);

        sc.close();

    }

}
