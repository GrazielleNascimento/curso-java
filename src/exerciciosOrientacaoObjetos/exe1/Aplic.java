package exerciciosOrientacaoObjetos.exe1;

import exerciciosOrientacaoObjetos.exe1.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazielle
 */
public class Aplic {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Area: " + rectangle.area());

        System.out.println("Perimeter: " + rectangle.perimeter());
        
        System.out.println("Diagonal: " + rectangle.diagonal());
    }

}
