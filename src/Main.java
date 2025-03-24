import bank.accounts.*;
import bank.customers.*;

public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        bank.addAccount(new TransactionAccount("6046-5135-9685-7102", "Reza Babaee", 1000));
        bank.addAccount(new TransactionAccount("6147-5785-9625-7192", "Amir Babaee", 52.50));
        bank.addAccount(new TransactionAccount("6456-5785-9675-1232", "Farhad Babaee", 123.75));

        bank.addAccount(new SavingAccount("5046-5435-9695-7143", "Hassan Hassani", 1990.45));
        bank.addAccount(new SavingAccount("5159-5485-9745-7513", "Ali Hassani", 2000));
        bank.addAccount(new SavingAccount("5346-8512-1195-7279", "Arash Hassani", 365.40));

        int counter = 1;

        System.out.println("\nStep " + counter + ":");
        counter++;

        BankAccount account1 = bank.findAccount("6046-5135-9685-7102");
        BankAccount account2 = bank.findAccount("6147-5785-9625-7192");
        BankAccount account3 = bank.findAccount("6456-5785-9675-1232");
        BankAccount account4 = bank.findAccount("5046-5435-9695-7143");
        BankAccount account5 = bank.findAccount("5159-5485-9745-7513");
        BankAccount account6 = bank.findAccount("5346-8512-1195-7279");
        BankAccount nonexistentAccount = bank.findAccount("4446-5565-1474-65982");


        System.out.println("\nStep " + counter + ":");
        counter++;

        accountCurrentBalance(account1);
        account1.deposit(45.25);
        accountCurrentBalance(account1);
        System.out.println();
        accountCurrentBalance(account4);
        account4.deposit(-45.25);
        accountCurrentBalance(account4);


        System.out.println("\nStep " + counter + ":");
        counter++;

        accountCurrentBalance(account2);
        account2.calculateInterest();
        accountCurrentBalance(account2);
        System.out.println();
        accountCurrentBalance(account5);
        account5.calculateInterest();
        accountCurrentBalance(account5);


        System.out.println("\nStep " + counter + ":");
        counter++;

        accountCurrentBalance(account3);
        account3.withdraw(50);
        accountCurrentBalance(account3);
        account3.withdraw(-50);
        accountCurrentBalance(account3);
        account3.withdraw(500);
        accountCurrentBalance(account3);
        System.out.println();
        accountCurrentBalance(account6);
        account6.withdraw(500);
        accountCurrentBalance(account6);
        account6.withdraw(-50);
        accountCurrentBalance(account6);
        account6.withdraw(1500);
        accountCurrentBalance(account6);

        System.out.println("\nStep " + counter + ":");
        counter++;

        bank.showAllBalances();
    }

    public static void accountCurrentBalance(BankAccount account){
        System.out.println(account.getAccountNumber() + " account current balance: " + account.getBalance());
    }
}
