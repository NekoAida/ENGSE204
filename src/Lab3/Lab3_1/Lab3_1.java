package Lab3_1;

import java.util.Scanner;

class User {

    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String name = input.nextLine();

        User newuser = new User(name);

        System.out.println(newuser.getUsername());

        input.close();

    }
}
