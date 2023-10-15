package encapsulamento;

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

        System.out.println("Product data: ");

        System.out.print("name: ");
        String name = sc.next();

        System.out.print("price: ");
        double price = sc.nextDouble();

//         System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();
//
//        instanciando um obj utilizando o construtor com quantidade  
//        Product product = new Product(name, price, quantity);
        // instanciando um obj utilizando o construtor sem quantidade        
        Product product = new Product(name, price);

        product.setName("Computador");
        System.out.println("update name: " + product.getName());

        product.setPrice(1200.00);
        System.out.println("update price: " + product.getPrice());

        System.out.println();
        System.out.println("Enter Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

    }

}
