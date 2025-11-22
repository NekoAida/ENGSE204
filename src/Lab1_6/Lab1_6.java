package Lab1_6;
import java.util.Scanner;

public class Lab1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }

    }
}
