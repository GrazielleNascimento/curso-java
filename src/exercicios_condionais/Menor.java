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
public class Menor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {

            System.out.println(" MENOR = " + a);
        } else if (b < c) {
            System.out.println("MENOR = " + b);
        } else {
            System.out.println("MENOR = " + c);

        }
        sc.close();
    }

}
