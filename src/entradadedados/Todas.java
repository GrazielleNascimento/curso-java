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
public class Todas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // EXEMPLO COM TODAS STRING, INT, DOUBLE, CHAR
         Locale.setDefault(Locale.US); // para digitar usando ponto inves de virgula
        
        Scanner sc = new Scanner(System.in);
        
        String x;
        int y;
        double z;
        
        
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        
        System.out.println("Dados digitados: ");
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
            
        
        sc.close();
    }
    
}
