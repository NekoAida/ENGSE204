package Lab1.Lab1_2;
import java.util.Scanner;

public class Lab1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Width: ");
        double A = input.nextDouble();

        System.out.println("Enter Height: ");
        double B = input.nextDouble();

        System.out.println("Result: " + (A * B));

    }
}
