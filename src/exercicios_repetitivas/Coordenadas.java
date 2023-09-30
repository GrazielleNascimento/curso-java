package exercicios_repetitivas;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Coordenadas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");

            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");

            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {

                System.out.println("Quarto");

            }

            x = sc.nextInt();

        y = sc.nextInt();

        }

    }

}
