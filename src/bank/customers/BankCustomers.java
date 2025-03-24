package bank.customers;

import bank.accounts.BankAccount;
import java.util.ArrayList;

public class BankCustomers {
    private final ArrayList<BankAccount> accountsList;

    public BankCustomers() {
        accountsList = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount account){
        accountsList.add(account);
    }

    public void showAllBalances(){
        int counter = 1;
        for(BankAccount account : accountsList){
            System.out.println("Account " + counter + ":");
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Account holder's name: " + account.getAccountHolderName());
            System.out.println("Balance : " + account.getBalance());
            System.out.println();
            counter++;
        }
    }

    public BankAccount findAccount(String accountNumber){
        for(BankAccount account : accountsList){
            if(accountNumber.equals(account.getAccountNumber())) {
                System.out.println("Account number: " + account.getAccountNumber());
                System.out.println("Account holder's name: " + account.getAccountHolderName());
                System.out.println("Balance : " + account.getBalance());
                System.out.println();
                return account;
            }
        }
        System.out.println("Error!");
        System.out.println(accountNumber + " account doesn't exist.");
        return null;
    }
}