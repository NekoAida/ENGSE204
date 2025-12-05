package Lab3.Lab3_14;
import java.util.Scanner;

class BankAccount {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initBalance) {
        this.balance = (initBalance >= 0) ? initBalance : 0;
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        this.balance += amount;
        totalTransactionCount++;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return;
        }

        this.balance -= amount;
        totalTransactionCount++;
        System.out.println("Withdrawal successful.");
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
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null;

        System.out.print("Enter N: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("1.CREATE 2.DEPOSIT 3.WITHDRAW 4.STATUS 5.GLOBAL_STATUS");
                System.out.print("Enter Command: ");
                String cmd = scanner.next();

                switch (cmd) {
                    case "CREATE":
                        System.out.print("Enter Initial Deposit: ");
                        double initDep = scanner.nextDouble();
                        myAccount = new BankAccount(initDep);
                        break;

                    case "DEPOSIT":
                        System.out.print("Enter Amount: ");
                        double depAmt = scanner.nextDouble();
                        if (myAccount == null) {
                            System.out.println("No account exists.");
                        } else {
                            myAccount.deposit(depAmt);
                        }
                        break;

                    case "WITHDRAW":
                        System.out.print("Enter Amount: ");
                        double wdAmt = scanner.nextDouble();
                        if (myAccount == null) {
                            System.out.println("No account exists.");
                        } else {
                            myAccount.withdraw(wdAmt);
                        }
                        break;

                    case "STATUS":
                        if (myAccount == null) {
                            System.out.println("No account exists.");
                        } else {
                            System.out.println("Balance: " + myAccount.getBalance());
                        }
                        break;

                    case "GLOBAL_STATUS":
                        System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
                        break;

                    default:
                        break;
                }
            }
        }
        scanner.close();
    }
}