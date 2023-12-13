import encap.BankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean startProgram = true;
        Scanner scanner = new Scanner(System.in);
        while(startProgram){
            System.out.print("Enter accountHolders name: ");
            scanner.nextLine();
            System.out.println("Enter account Number");
            scanner.nextLine();
            System.out.println("Enter account balance");
        }
        BankAccount abc = new BankAccount("456", 0, "Biplab");
        System.out.println("Done with account 1 creation");
        BankAccount xyz = new BankAccount("889", 300, "Sabina");
        System.out.println("Done with account 2 creation");
        abc.deposit(300);
        xyz.calculateInterest(10);
        xyz.deposit(300);
        System.out.println(BankAccount.getTotalAccountsNumbers());
        BankAccount.displayAllAccounts();
    }
}