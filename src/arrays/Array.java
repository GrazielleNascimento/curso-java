
package arrays;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Array {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros;
        
        System.out.print("Informe o Tamanho do Array: ");
        int tamanhoArray = sc.nextInt(); //tamanho do array
        numeros = new int[tamanhoArray];
        
        
        for(int i =0; i < tamanhoArray; i++){
            System.out.print("Informe o valor: ");
             numeros[i] = sc.nextInt();
        }
        
        System.out.println();
        
       for(int num: numeros) {
           System.out.print(num + " ");// mostrar todos os valores do Array
       }
 
       
    }
    
}
