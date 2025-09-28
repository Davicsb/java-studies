package Aplication;

import Model.entities.Account;
import Model.excepitions.EntitiesException;

import java.util.*;

public class App {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);


            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(withdrawLimit, balance, holder, number);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (EntitiesException e) {
            System.out.println("Withdraw error: " + e.getMessage());

        }
    }
}
