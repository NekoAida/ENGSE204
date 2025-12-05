package Lab3.Lab3_12;
import java.util.Scanner;

class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return this.monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        double annualSalary = getAnnualSalary();
        return annualSalary * taxRate;
    }
}

public class Lab3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter Tax Rate (e.g. 0.10): ");
        double taxRate = input.nextDouble();

        System.out.print("Enter Raise Amount: ");
        double raiseAmount = input.nextDouble();

        Employee emp = new Employee(name, salary);

        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        input.close();
    }
}