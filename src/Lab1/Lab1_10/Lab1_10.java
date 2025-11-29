package Lab1.Lab1_10;
import java.util.Scanner;

public class Lab1_10 {
    public static double calculateArea(double width,double height) {
        return width * height;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Width: ");
        double width = input.nextDouble();

        System.out.print("Enter Height: ");
        double height = input.nextDouble();

        double result = calculateArea(width, height);
        System.out.println("Area: " + result);
    }
}