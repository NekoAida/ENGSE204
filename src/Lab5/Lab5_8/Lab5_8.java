package Lab5.Lab5_8;
import java.util.Scanner;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + this.name;
    }
}

class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + this.name + ", ID: " + this.studentId;
    }
}

class Employee extends Person {
    protected double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        this.salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + this.name + ", Salary: " + this.salary;
    }
}

public class Lab5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String sName = input.nextLine();

        System.out.print("Enter Student ID: ");
        int sId = input.nextInt();
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        String eName = input.nextLine();

        System.out.print("Enter Employee Salary: ");
        double eSalary = input.nextDouble();

        Student student = new Student(sName, sId);
        Employee employee = new Employee(eName, eSalary);

        Person[] people = {student, employee};

        for (Person p : people) {
            if (p instanceof Employee) {
                Employee emp = (Employee) p;
                emp.applyBonus(1000.0);
            }
        }

        for (Person p : people) {
            System.out.println(p.getStatus());
        }

        input.close();
    }
}