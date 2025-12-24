package Lab5.Lab5_15;
import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Car Model: ");
        String cModel = input.nextLine();

        System.out.print("Enter Rental Rate: ");
        double cRate = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Motorcycle Model: ");
        String mModel = input.nextLine();

        System.out.print("Enter Rental Rate: ");
        double mRate = input.nextDouble();

        Car car = new Car(cModel, cRate);
        Motorcycle moto = new Motorcycle(mModel, mRate);

        RentalVehicle[] vehicles = {car, moto};

        double totalFee = 0;
        for (RentalVehicle v : vehicles) {
            totalFee += v.calculateFee();
        }

        System.out.println(totalFee);

        input.close();
    }
}