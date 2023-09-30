/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Soma {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("SOMA = " + soma);
    }
    
}
