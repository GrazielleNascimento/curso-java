/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
 * Apresente a média ponderada para cada um destes conjuntos de 3 valores,
 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 */
package laco_for;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazielle
 */
public class mediaPonderada {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int i, n;

        double med1, med2, med3, mediaFinal = 0;

        System.out.print("n: ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            
            System.out.println();

            System.out.print("med1: ");
            med1 = sc.nextDouble();
            
            System.out.print("med2: ");
            med2 = sc.nextDouble();
            
            
            System.out.print("med3: ");
            med3 = sc.nextDouble();

            mediaFinal = (med1 * 2.0 + med2 * 3.0 + med3 * 5.0) / 10.0;
            
            System.out.println();
            
            System.out.printf("Media final:  %.1f", mediaFinal);
            
            System.out.println();
        }

    }

}
