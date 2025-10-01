import java.io.FileWriter;
import java.io.IOException;

public class Account extends Bank {

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            recordTransaction("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            recordTransaction("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
            recordTransaction("Failed Withdrawal: " + amount);
        }
    }

    @Override
    public double getBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    private void recordTransaction(String message) {
        try (FileWriter writer = new FileWriter("Bank.txt", true)) {
            writer.write(accountName + " - " + message + " | Balance: " + balance + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
