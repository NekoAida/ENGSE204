package Lab1_3;
import java.util.Scanner;

public class Lab1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int A = input.nextInt();

        int B = A % 2;

        if (B == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

}
