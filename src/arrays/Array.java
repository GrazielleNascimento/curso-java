/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author grazi
 */
public class Array {

 
    public static void main(String[] args) {
        
        int[] numeros;
        int tamanhoArray = 5; //tamanho do array
        numeros = new int[tamanhoArray];
        
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 8;
        numeros[3] = 3;
        numeros[4] = 6;
        
       for(int num: numeros) {
           System.out.println(num);// mostrar todos os valores do Array
       }
 
       
    }
    
}
