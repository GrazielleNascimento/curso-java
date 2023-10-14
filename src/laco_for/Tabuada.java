package laco_for;

import java.util.Scanner;

/**
 *
 * @author grazielle
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, aux, n;

        for (aux = 0; aux < 3; aux++) {

            do {

                System.out.print("Digite o numero: ");
                n = sc.nextInt();

            } while (n <= 2 || n >= 1000);

            if (n > 2 && n < 1000) {

                for (i = 1; i <= 10; i++) {
                    System.out.println(i + "x" + n + "=" + i * n);
                }

            }

        }

    }

}
