/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //EXEMPLO STRING   valor de entrada na variavel  sc.next()
        Scanner sc = new Scanner(System.in);

        String x 
        x  = sc.next();

        System.out.println("voce digitou: " + x);

        sc.close();

    }
}
