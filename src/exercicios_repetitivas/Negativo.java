/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_repetitivas;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Negativo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if (idade < 0) {

            System.out.println("Impossivel calcular ");

        } else {

            double soma = idade;
            int qtd = 1;

            while (idade >= 0) {

                idade = sc.nextInt();

                if (idade >= 0) {

                    soma = soma + idade;

                    qtd++;

                }

            }

            double media = soma / qtd;

            System.out.println(df.format(media));
        }

    }

}
