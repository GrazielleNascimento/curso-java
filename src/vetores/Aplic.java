
package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class Aplic {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // pedir p/ o usuario o tam
        Product[] vect = new Product[n]; //criacao vo vetor
        
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter price: ");
            double price = sc.nextDouble();
            
            //instaciar um novo produtoe a posicao i, ira apontar para ele
            vect[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        for(int i =0; i < vect.length; i++){
            sum += vect[i].getPrice();// para pegar o preço pela posicao do vetor      
        }
        
        double avg = sum / vect.length;
        
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        
        sc.close();                
        
    }
    
}
