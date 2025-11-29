package Lab2.Lab2_8;
import java.util.Scanner;

class TempConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class Lab2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mode F_TO_C Or C_TO_F: ");
        String mode = input.nextLine();

        System.out.print("Enter temp: ");
        double temp = input.nextDouble();

        if (mode.equals("C_TO_F")) {
            double result = TempConverter.celsiusToFahrenheit(temp);
            System.out.println(result);
        } else if (mode.equals("F_TO_C")) {
            double result = TempConverter.fahrenheitToCelsius(temp);
            System.out.println(result);
        }

        input.close();
    }
}
