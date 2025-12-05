package Lab3.Lab3_15;
import java.util.Scanner;

class User {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public void login(String password) {
        if (this.isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) {
            this.failedAttempts = 0;
            System.out.println("Login successful.");
        }
        else {
            this.failedAttempts++;

            if (this.failedAttempts >= maxAttempts) {
                this.isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int left = maxAttempts - this.failedAttempts;
                System.out.println("Login failed. " + left + " attempts left.");
            }
        }
    }

    public String getUsername() { return this.username; }
    public boolean isLocked() { return this.isLocked; }
    public int getFailedAttempts() { return this.failedAttempts; }
}

public class Lab3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        User currentUser = new User(username);

        System.out.print("Enter number of commands (N): ");
        if (input.hasNextInt()) {
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Command (SET_POLICY [max], LOGIN [pass]): ");

                String command = input.next();

                if (command.equals("SET_POLICY")) {
                    System.out.print("Enter newpolicy: ");
                    int newMax = input.nextInt();
                    User.setPolicy(newMax);

                } else if (command.equals("LOGIN")) {
                    System.out.print("Enter password: ");
                    String password = input.next();
                    currentUser.login(password);
                }
            }
        }

        input.close();
    }
}