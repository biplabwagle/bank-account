import encap.BankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean startProgram = true;
        Scanner scanner = new Scanner(System.in);
        while(startProgram){
            startProgram = runner(scanner);
        }
    }

    public static boolean runner(Scanner scanner){
        System.out.print("Enter accountHolders name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account balance: ");
        double amount = scanner.nextDouble();
        //Storing the carriage return after getting nextDouble in the line above
        scanner.nextLine();
        System.out.println("Creating account...");
        new BankAccount(accountNumber, amount, name);
        BankAccount.displayAllAccounts();
        System.out.println("Done.........");

        System.out.print("Would you like to add more account yes or no: ");
        String userInput = scanner.nextLine();

        boolean startProgram = userInput.equalsIgnoreCase("yes") ? true : false;

        if(startProgram){
            return true;
        }
        else{
            return false;
        }

    }

}