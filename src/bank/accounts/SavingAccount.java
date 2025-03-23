package bank.accounts;

public class SavingAccount extends BankAccount{
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double InitialBalance) {
        super(accountNumber, accountHolderName, InitialBalance);
    }

    @Override
    public void calculateInterest(){
        System.out.println("interest deposit of " + getAccountNumber() + "saving account :");
        deposit(balance * interestRate);
    }

}
