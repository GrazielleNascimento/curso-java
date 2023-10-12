package orientacaoObjetos;

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
        
        Product  product = new Product();
        
        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        product.name = sc.next();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println(product.name +  ","  + product.price + ","  + product.quantity );
        
        sc.close();
        

        }

}
