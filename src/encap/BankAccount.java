package encap;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BankAccount implements BankAccountInterface {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private LocalDate accountCreationDate;
    private static Set<String> accountNumbers = new HashSet<>();
    private static Set<BankAccount> accounts = new HashSet<>();
    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        if(accountNumbers.contains(accountNumber)){
            System.out.println("This account number already exists");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountCreationDate = LocalDate.now();
        this.accountNumbers.add(accountNumber);
        accounts.add(this);
    }
    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Please enter an amount that is greater tha 0");
        }
        return balance;
    }

    @Override
    public double getBalance(){
        return this.balance;
    }
    @Override
    public double withdrawal(double amount){
        if(amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Please enter a valid amount");
        }
        return balance;
    }

    @Override
    public boolean transferAmount(BankAccount targetAccount, double amount){

        return true;
    }

    @Override
    public double calculateInterest(double annualRate){
        long accountAgeInDays = ChronoUnit.DAYS.between(accountCreationDate, LocalDate.now());
        double interest = balance * (annualRate * 100) * (accountAgeInDays / 365.25);
        return interest;
    }

    public static int getTotalAccountsNumbers(){
        return accountNumbers.size();
    }

    public static void displayAllAccounts(){
        Iterator <BankAccount> iterator = BankAccount.accounts.iterator();
        while(iterator.hasNext()){
            BankAccount account = iterator.next();
            System.out.println("-----------------------------");
            System.out.println("Printing information for " + account.accountHolderName);
            System.out.println("-----------------------------");
            System.out.println("Account Created on: " +account.accountCreationDate);
            System.out.println("Account Number: " +account.accountNumber);
            System.out.println("Account Balance: " +account.balance);
            System.out.println("End of execution for " +account.accountHolderName + " bank account");

        }
    }

}
