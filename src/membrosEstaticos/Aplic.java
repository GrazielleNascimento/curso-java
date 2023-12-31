package membrosEstaticos;

import java.util.Locale;

import java.util.Scanner;
import membrosEstaticos.util.Calculator;

/**
 *
 * @author grazielle
 */
public class Aplic {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);      

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);

        System.out.printf("Volume: %.2f%n", v);

        System.out.printf("PI: %.2f%n", Calculator.PI);//constante PI

        sc.close();

    }

}
