package Lab1.Lab1_4;
import java.util.Scanner;

public class Lab1_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter gpa: ");
        int gpa = input.nextInt();

        if (gpa < 0 || gpa > 100) {
            System.out.println("Error");
        } else if (gpa >= 80) {
            System.out.println("A");
        } else if (gpa >= 70) {
            System.out.println("B");
        } else if (gpa >= 60) {
            System.out.println("C");
        } else if (gpa >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
