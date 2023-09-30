/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_repetitivas;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Senha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");

            System.out.println("Informe a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }

}
