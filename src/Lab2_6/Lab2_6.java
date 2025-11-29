package Lab2_6;
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
}

public class Lab2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String ownerName = input.nextLine();

        System.out.print("Enter initialBalance: ");
        double initialBalance = input.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double despositAmount = input.nextDouble();

        BankAccount myAccount = new BankAccount(ownerName, initialBalance);

        myAccount.deposit(despositAmount);

        myAccount.displaySummary();

        input.close();
    }
}
