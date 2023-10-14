package exerciciosOrientacaoObjetos.exe3;

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

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.next();

        System.out.print("First grade: ");
        student.a = sc.nextDouble();

        System.out.print("Second grade: ");

        student.b = sc.nextDouble();

        System.out.print("third grade: ");
        student.c = sc.nextDouble();

        System.out.printf("final grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("Failed");

            System.out.println("Missing " + student.missingPoints());

        } else {
            System.out.println("Pass");

        }

    }

}
