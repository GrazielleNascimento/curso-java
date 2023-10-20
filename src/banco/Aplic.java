package banco;

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

        System.out.print("Enter account number: ");
        Integer number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String holder = sc.next();

        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);
        
        Account account;
        
        if (option == 'y') {

            System.out.print("\nEnter initial deposit value: ");
            double inicialDeposit = sc.nextDouble();

           account = new Account(number, holder, inicialDeposit);

        }
        else {
            account = new Account(number, holder);
        }
        
        
        System.out.println("Account data: " );
        System.out.println(account);
        
        System.out.print("\nEnter a deposit value: ");
        account.deposit(sc.nextDouble()); 
        System.out.println("Updated account data: ");
        System.out.println(account);
        
        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);

    }
    
    

}
