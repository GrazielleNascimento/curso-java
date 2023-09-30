/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Double {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EXEMPLO DOUBLE   valor de entrada na variavel  sc.nextDouble()
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double x;
        x = sc.nextDouble();
        System.out.printf("Voce digitou: %.2f%n",  x);
        
        sc.close();   
    }
    
}
