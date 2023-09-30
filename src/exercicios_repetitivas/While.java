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
public class While {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        int x = sc.nextInt();
        int soma = 0;
        
        while(x != 0){
           soma = soma + x;
           x = sc.nextInt();
           
        }
        
        System.out.println("a soma dos numeros e : "+ soma);
         sc.close();
        
    }
    
}
