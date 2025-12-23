package Lab5.Lab5_7;
import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class Lab5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Sales Employee Name: ");
        String sName = input.nextLine();

        System.out.print("Enter Base Salary: ");
        double sSalary = input.nextDouble();

        System.out.print("Enter Commission Rate: ");
        double sRate = input.nextDouble();

        input.nextLine();

        System.out.print("Enter Manager Name: ");
        String mName = input.nextLine();

        System.out.print("Enter Base Salary: ");
        double mSalary = input.nextDouble();

        System.out.print("Enter Fixed Bonus: ");
        double mBonus = input.nextDouble();

        SalesEmployee salesEmp = new SalesEmployee(sName, sSalary, sRate);
        Manager manager = new Manager(mName, mSalary, mBonus);

        PayrollProcessor.process(salesEmp);
        PayrollProcessor.process(manager);

        input.close();
    }
}