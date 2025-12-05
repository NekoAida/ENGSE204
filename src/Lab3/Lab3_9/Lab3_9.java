package Lab3.Lab3_9;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private static int minPasswordLength = 8;

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }

    public User(String username, String password) {
        this.username = username;
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }
}

public class Lab3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Min Length1: ");
        int minLength1 = input.nextInt();
        input.nextLine();

        User.setMinLength(minLength1);

        System.out.print("Enter User Name1: ");
        String user1_name = input.nextLine();
        System.out.print("Enter User Pass1: ");
        String user1_pass = input.nextLine();
        User user1 = new User(user1_name, user1_pass);

        System.out.print("Enter User Name2: ");
        String user2_name = input.nextLine();
        System.out.print("Enter User Pass2: ");
        String user2_pass = input.nextLine();
        User user2 = new User(user2_name, user2_pass);

        System.out.print("Enter Min Length2: ");
        int minLength2 = input.nextInt();
        input.nextLine();

        User.setMinLength(minLength2);

        System.out.print("Enter New User Pass2: ");
        String user2_newPass = input.nextLine();
        user2.setPassword(user2_newPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        input.close();
    }
}