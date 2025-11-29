package Lab2.Lab2_11;
import java.util.Scanner;

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}

public class Lab2_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Car Model: ");
        String carModel = input.nextLine();

        System.out.print("Enter Year: ");
        int oldYear = input.nextInt();

        System.out.print("Enter New Year: ");
        int newYear = input.nextInt();

        Car car = new Car(carModel, oldYear);
        car.setYear(newYear);

        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        input.close();
    }
}
