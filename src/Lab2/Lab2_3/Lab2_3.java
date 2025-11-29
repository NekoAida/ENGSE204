package Lab2.Lab2_3;

import java.util.Scanner;

class Student {
    private String studentId;
    private String name;
    public static int studentCount = 0;

    public Student(String id, String n) {
        this.studentId = id;
        this.name = n;
        studentCount++;
    }
}

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter StudentID: ");
            String studentId = input.nextLine();

            System.out.print("Enter Student Name: ");
            String name = input.nextLine();

            Student student = new Student(studentId, name);
        }

        System.out.println(Student.studentCount);
        input.close();
    }
}
