package Lab3.Lab3_14;
import java.util.Scanner;

class BankAccount {
    private double balance;

    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount++; // บวกตัวนับ Static
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            totalTransactionCount++; // บวกตัวนับ Static
            System.out.println("Withdrawal successful.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class Lab3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount myAccount = null;

        System.out.print("Enter number of commands (N): ");
        if (input.hasNextInt()) {
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Command (CREATE, DEPOSIT, WITHDRAW, STATUS, GLOBAL_STATUS): ");
                String command = input.next();

                if (command.equals("CREATE")) {
                    System.out.print("Enter Initial Deposit: ");
                    double amount = input.nextDouble();
                    myAccount = new BankAccount(amount);

                } else if (command.equals("DEPOSIT")) {
                    System.out.print("Enter Amount: ");
                    double amount = input.nextDouble();
                    if (myAccount != null) {
                        myAccount.deposit(amount);
                    } else {
                        System.out.println("No account exists.");
                    }

                } else if (command.equals("WITHDRAW")) {
                    System.out.print("Enter Amount: ");
                    double amount = input.nextDouble();
                    if (myAccount != null) {
                        myAccount.withdraw(amount);
                    } else {
                        System.out.println("No account exists.");
                    }

                } else if (command.equals("STATUS")) {
                    if (myAccount != null) {
                        System.out.println("Balance: " + myAccount.getBalance());
                    } else {
                        System.out.println("No account exists.");
                    }

                } else if (command.equals("GLOBAL_STATUS")) {
                    System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
                }
            }
        }

        input.close();
    }
}