package Lab1_11;
import java.util.Scanner;

public class Lab1_11 {
    public static int sumArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array: ");
        int maxarray = input.nextInt();

        int [] array = new int [maxarray];
        System.out.println("Enter Number: ");

        for (int i = 0; i < maxarray; i++) {
            array[i] = input.nextInt();
        }

        int result = sumArray(array);
        System.out.println("result: " + result);
    }
}
