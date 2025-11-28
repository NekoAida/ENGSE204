package Lab2_2;
import java.util.Scanner;

class Student {
    private String studentID;
    private String name;

    public Student(String id, String n) {
        this.studentID = id;
        this.name = n;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public void displayInfo() {
        System.out.println("ID: " + this.getStudentID());
        System.out.println("Name: "+ this.getName());
    }
}

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter StudentID: ");
        String studentID = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        Student student = new Student(studentID, name);
        student.displayInfo();
        input.close();
    }
}
