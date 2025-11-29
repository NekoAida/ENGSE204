package Lab2_4;
import java.util.Scanner;

class Student {

    private String name;
    private int midtermScore;
    private int finalScore;

    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public double calculateAverage() {
        return (this.midtermScore + this.finalScore) / 2.0;
    }

    public void displaySummary() {
        double average = this.calculateAverage();

        System.out.println("Name: " + this.name);
        System.out.println("Average Score: " + average);

        System.out.print("Status: ");
        if (average >= 50.0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Name: ");
        String name = input.nextLine();

        System.out.print("Input Midterm Score: ");
        int midtermScore = input.nextInt();

        System.out.print("Input Final Score: ");
        int finalScore = input.nextInt();

        Student student = new Student(name, midtermScore, finalScore);

        student.displaySummary();

        input.close();
    }
}