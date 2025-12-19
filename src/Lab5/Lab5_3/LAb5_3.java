package Lab5.Lab5_3;
import java.util.Scanner;

class Employee {
    protected double salary;

    public double calculateBonus() {
        return this.salary * 0.10;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (this.salary * 0.05);
    }
}

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double inputSalary = input.nextDouble();

        Manager myManager = new Manager();
        myManager.salary = inputSalary;

        System.out.println(myManager.calculateBonus());

        input.close();
    }
}