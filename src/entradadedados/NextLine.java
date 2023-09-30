
package entradadedados;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class NextLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //PARA LER UM TEXTO ATE A QUEBRA DE LINHA 
        /*  Scanner sc = new Scanner(System.in);
       
       String s1, s2, s3;
       
       s1 = sc.nextLine();
       s2 = sc.nextLine();
       s3 = sc.nextLine();
       
      
     System.out.println("Dados digitados: ");
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s3);
         */
        
        //Quebra de linha pendente
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();

        sc.nextLine();

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
    }
    

