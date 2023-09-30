package exercicios_condionais;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Horas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora = sc.nextInt();

        System.out.println("Que horas sao: ");

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
        sc.close();
    }

}
