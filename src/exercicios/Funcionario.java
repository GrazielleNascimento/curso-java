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
public class Funcionario {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       int number = sc.nextInt();
       int  horasTrabalhadas = sc.nextInt();
       double  valorHora = sc.nextDouble();
       
       double calc = horasTrabalhadas * valorHora;
       
        System.out.println("NUMBER: " + number);
        System.out.printf("SALARY: U$%.2f",calc);
       
       
    }
    
}
