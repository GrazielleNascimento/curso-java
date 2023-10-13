package exerciciosOrientacaoObjetos.exe2;

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

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.next();

        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        

        System.out.println("\nemployee: " + employee);

        System.out.print("\nWhich percentage to increase salary?: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("\nUpdated data: " + employee);
        
        sc.close();
    }

}
