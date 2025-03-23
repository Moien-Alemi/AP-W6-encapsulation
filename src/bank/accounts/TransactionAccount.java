package bank.accounts;

public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest(){
        System.out.println("Transaction accounts don't have interest.");
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Error!\nwithdrawal amount is invalid.");
        } else if (amount > (balance + overDraftLimit)) {
            System.out.println("There's not enough credit in " + getAccountNumber() + " account to withdraw");
        } else {
            balance -= amount;
            System.out.println("withdrew " + amount + "$ from " + getAccountNumber() + " account");
        }
    }
}