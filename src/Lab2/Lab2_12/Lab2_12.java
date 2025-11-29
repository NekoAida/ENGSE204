package Lab2.Lab2_12;
import java.util.Scanner;

class Course {
    private String courseID;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseID = courseId;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return this.courseID + ":" + this.courseName;
    }
}

class Student {
    private String studentName;
    private Course enrolledCourse;

    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}
public class Lab2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter CourseID: ");
        String courseId = input.nextLine();

        System.out.print("Enter CourseName: ");
        String courseName = input.nextLine();

        System.out.print("Enter StudentName: ");
        String studentName = input.nextLine();

        Course course = new Course(courseId, courseName);
        Student student = new Student(studentName, course);

        student.displayEnrollment();

        input.close();

    }
}
