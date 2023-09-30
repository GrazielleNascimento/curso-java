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
public class Negativo {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       
       if(num < 0){
           System.out.println("NEGATIVO");
       }else{
           System.out.println("NAO NEGATIVO");
       }
       sc.close();
    }
    
}
