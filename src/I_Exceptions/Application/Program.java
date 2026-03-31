package I_Exceptions.Application;

import I_Exceptions.Model.Entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account ac = new Account();

        try {
            System.out.println("Enter account data:");
            System.out.printf("Number: ");
            int number = sc.nextInt();
            System.out.printf("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.printf("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.printf("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            ac = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.printf("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            ac.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", ac.getBalance()));
            System.out.println(ac.getHolder());
        }
        catch (IllegalArgumentException e){
            System.out.printf(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
        catch (Exception e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
