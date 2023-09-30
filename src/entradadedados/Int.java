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
public class Int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EXEMPLO INT   valor de entrada na variavel  sc.nextInt()
         Scanner sc = new Scanner(System.in);
        
        int x;
        x = sc.nextInt();
        System.out.println("Voce digitou: " + x);
        
        sc.close();   
    }
    
}
