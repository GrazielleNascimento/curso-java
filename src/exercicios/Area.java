/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Area {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double valorMetro = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorMetro;

        System.out.printf("AREA : %.2f%n", area);
        System.out.printf("PRECO : %.2f%n", preco);

    }

}
