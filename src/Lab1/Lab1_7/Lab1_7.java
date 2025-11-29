package Lab1.Lab1_7;
import java.util.Scanner;

public class Lab1_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array: ");
        int size = input.nextInt();

        int sum = 0;

        System.out.println("Enter Number in array: ");
        for (int i = 0; i < size; i++) {

            int number = input.nextInt();

            sum = sum + number;
        }
        System.out.println("Result: " + sum);
    }
}
