package Lab2_1;
import java.util.Scanner;

public class Student {

    private String studentID;
    private String name;
    private double gpa;
    private  int year;
    private String major;
    private  boolean isActive;

    public Student(String id, String n, String m, int y) {
        this.studentID = id;
        this.name = n;
        this.major = m;
        this.year = y;
        this.gpa = 0.0;
        this.isActive = true;
    }
}

public class Lab2_1 {
    public static void main(String[] args);
    Scanner input = new Scanner(System.in);

}
