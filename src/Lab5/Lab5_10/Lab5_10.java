package Lab5.Lab5_10;
import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Lab5_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Complex Task Description: ");
        String cDesc = input.nextLine();

        System.out.print("Enter Hours: ");
        int cHours = input.nextInt();

        System.out.print("Enter Setup Fee: ");
        double cFee = input.nextDouble();

        input.nextLine();

        System.out.print("Enter Simple Task Description: ");
        String sDesc = input.nextLine();

        System.out.print("Enter Hours: ");
        int sHours = input.nextInt();

        ComplexTask complexTask = new ComplexTask(cDesc, cHours, cFee);
        SimpleTask simpleTask = new SimpleTask(sDesc, sHours);

        ProjectTask[] tasks = {complexTask, simpleTask};

        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }

        input.close();
    }
}