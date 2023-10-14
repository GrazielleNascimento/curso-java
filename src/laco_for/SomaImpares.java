package laco_for;

import java.util.Scanner;

/**
 *
 * @author grazielle
 */
public class SomaImpares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, x, y, min, max, soma = 0;

        System.out.print("X: ");
        x = sc.nextInt();
        System.out.print("Y: ");
        y = sc.nextInt();
        System.out.println("");

        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }
        for (i = min + 1; i < max; i++) {

            if (i % 2 != 0) {

                System.out.print(i + ",");
                

                soma = soma + i;
            }

        }

        System.out.println("\n\nA soma dos numeros impares entre " +  min  + " e " +  max + " = " + soma);

    }

}
