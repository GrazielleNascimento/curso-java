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
public class Crescente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {

            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }

            x = sc.nextInt();
            y = sc.nextInt();

        }

    }

}
