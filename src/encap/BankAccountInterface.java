package encap;

public interface BankAccountInterface {
    public double deposit(double amount);
    public double getBalance();
    public double withdrawal(double amount);
    public boolean transferAmount(BankAccount targetAccount, double amount);
    public double calculateInterest(double annualRate);


}
