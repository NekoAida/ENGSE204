package Lab1_8;
import java.util.Scanner;

public class Lab1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Endter Array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];


        System.out.println("Enter Number in array: ");
        for (int i = 0; i < size; i++) {

            numbers[i] = input.nextInt();
        }

        int max = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
