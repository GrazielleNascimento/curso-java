package topicosJava;

import java.util.Scanner;

/**
 *
 * @author grazielle
 */
public class Bitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; // ou 32

        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }
        sc.close();

    }

}
