package Aplication;

import Users.User;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account numer: ");
        int account_number = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Is there an initial deposit? (Y/N)");
        char question = sc.next().charAt(0);

        User p;
        if (question == 'Y'){
            System.out.println("Enter an initial deposit: ");
            double initial_deposit = sc.nextDouble();
            p = new User(account_number, name, initial_deposit);
        }

        else{
           p = new User(account_number, name);
        }

        System.out.println("Account data:");
        System.out.println(p);

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        sc.nextLine();
        p.add_money(deposit);
        System.out.println("Account data:");
        System.out.println(p);

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        sc.nextLine();
        p.debit_money(withdraw);
        System.out.println("Account data:");
        System.out.println(p);

        sc.close();
    }
}
