package Lab2.Lab2_7;
import java.util.Scanner;

class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }
}

public class Lab2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String ownerName = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = input.nextDouble();

        System.out.print("Enter Withdraw Amount 1: ");
        double withdrawAmount1 = input.nextDouble();

        System.out.print("Enter Withdraw Amount 2: ");
        double withdrawAmount2 = input.nextDouble();

        BankAccount Account = new BankAccount(ownerName, initialBalance);

        Account.withdraw(withdrawAmount1);
        Account.withdraw(withdrawAmount2);

        Account.displayBalance();

        input.close();
    }
}