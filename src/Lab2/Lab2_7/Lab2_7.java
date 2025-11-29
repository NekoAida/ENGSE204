package Lab2.Lab2_7;
import java.util.Scanner;

class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance)  {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void displaySummary() {
        System.out.println("Owener: " + this.ownerName);
        System.out.println("Balance: " + this.balance);
    }

    public void withdraw(double amount)  {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Lab2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String ownerName = input.nextLine();

        System.out.print("Enter initialBalance: ");
        double initialBalance = input.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        double withdraw1 = input.nextDouble();
        System.out.print("Enter Withdraw Amount: ");
        double withdraw2 = input.nextDouble();

        BankAccount account = new BankAccount(ownerName, initialBalance);

        account.withdraw(withdraw1);
        account.withdraw(withdraw2);

        account.displayBalance();

        input.close();
    }
}
