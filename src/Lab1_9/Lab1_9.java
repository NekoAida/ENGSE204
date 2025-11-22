package Lab1_9;
import java.util.Scanner;

public class Lab1_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int sum = 0;
        System.out.println("Enter Number in array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);

    }
}
