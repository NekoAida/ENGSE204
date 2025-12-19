package Lab5.Lab5_4;
import java.util.Scanner;

class Vehicle {
    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int wheels;

    public Car(String color, int wheels) {
        super(color);
        this.wheels = wheels;
    }

    public void displayDetails() {
        System.out.println("Color: " + this.color + ", Wheels: " + this.wheels);
    }
}

public class Lab5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Color: ");
        String color = input.nextLine();

        System.out.print("Enter Wheels: ");
        int wheels = input.nextInt();

        Car car = new Car(color, wheels);
        car.displayDetails();

        input.close();
    }
}