package Lab3.Lab3_6;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class Lab3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double initialBalance = input.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = input.nextDouble();

        BankAccount myAccount = new BankAccount(initialBalance);

        myAccount.deposit(depositAmount);

        myAccount.withdraw(withdrawAmount);

        System.out.println("Final Balance: " + myAccount.getBalance());

        input.close();
    }
}