package Lab4.Lab4_12;
import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) {
        this.hour = hour;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

    public int getHour() {
        return this.hour;
    }

    public Schedule(Schedule other) {
        this.hour = other.hour;
    }
}

class EmployeeSchedule {
    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.println(this.name + ": " + this.schedule.getHour() + ":00");
    }
}

public class Lab4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Start Hour: ");
        int startHour = input.nextInt();

        System.out.print("Enter New Hour: ");
        int newHour = input.nextInt();

        Schedule sch1 = new Schedule(startHour);
        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        sch1.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();

        input.close();
    }
}