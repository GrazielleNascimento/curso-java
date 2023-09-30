/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_condionais;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Hora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int horaInicial = sc.nextInt();
       int horaFinal = sc.nextInt();
       
       int duracao;
       
       if(horaInicial < horaFinal){
           duracao = horaFinal - horaInicial;
       }
       else {
           duracao = 24 - horaInicial + horaFinal;
       }
        System.out.println("O jogo durou " + duracao + "Hora(s)");
        
        sc.close();
    }
    
    
}
