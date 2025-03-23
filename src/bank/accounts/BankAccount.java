package bank.accounts;

public abstract class BankAccount {

    private final String accountNumber;
    private final String accountHolderName;
    protected double balance;

    public BankAccount( String accountNumber,String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Error!\ndeposit amount is invalid.");
        }
        else {
            balance += amount;
            System.out.println("added " + amount + "$ to " + accountNumber + " account");
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Error!\nwithdrawal amount is invalid.");
        } else if (balance - amount < 0) {
            System.out.println("There's not enough money in " + accountNumber + " account to withdraw");
        } else {
            balance -= amount;
            System.out.println("withdrew " + amount + "$ from " + accountNumber + " account");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
