//Leia um valor inteiro X (1 <= X <= 1000).
//Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
package laco_for;

import java.util.Scanner;

/**
 *
 * @author grazielle
 */
public class Impar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        
        System.out.println("Informe o numero: ");

        int x = sc.nextInt();

        if (x >= 1 && x <= 1000) {

            for (i = 1; i <= x; i++) {

                if (i % 2 != 0) {

                    System.out.println(i);

                }

            }

        } else {
            System.out.println("numero invalido");
        }

    }

}
