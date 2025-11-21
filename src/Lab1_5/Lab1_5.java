package Lab1_5;
import java.util.Scanner;

public class Lab1_5 {

    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Number");
        System.out.println("1 Americano");
        System.out.println("2 Latte");
        System.out.println("3 Espresso");
        System.out.println("4 Mocha");

        System.out.println("Enter Number Menu: ");
        int A = input.nextInt();

        if (A < 1 || A > 4) {
            System.out.println("Invalid Menu");
        } else if (A == 1) {
            System.out.println("Americano");
        } else if (A == 2) {
            System.out.println("Latte");
        } else if (A == 3) {
            System.out.println("Espresso");
        } else {
            System.out.println("Mocha");
        }

    }
}
