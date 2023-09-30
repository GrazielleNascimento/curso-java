
package exercicios_condionais;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class NotaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        
        double soma = nota1 + nota2;
        
        System.out.printf("NOTA FINAL = %.1f%n", soma);
        
        if(soma < 60.0){
            System.out.println("REPROVADO");
        }
        
        sc.close();
    }
    
}
