package Lab2.Lab2_5;
import java.util.Scanner;

class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

public class Lab2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Width: ");
        double width = input.nextDouble();

        System.out.print("Enter Heigth: ");
        double heigth = input.nextDouble();

        Rectangle rect = new Rectangle(width, heigth);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        input.close();

    }
}
