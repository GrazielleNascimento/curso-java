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
public class Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EXEMPLO CHAR   valor de entrada na variavel  sc.nextDouble()

        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);

        System.out.println("voce digitou: " + x);

        sc.close(); // char tem como resposta apenas 1 string 1 character 
    }

}
