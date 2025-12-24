package Lab5.Lab5_13;
import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Lab5_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Developer Name: ");
        String dName = input.nextLine();

        System.out.print("Enter Number of Projects: ");
        int dProjects = input.nextInt();
        input.nextLine();

        System.out.print("Enter Admin Name: ");
        String aName = input.nextLine();

        System.out.print("Enter Number of Projects: ");
        int aProjects = input.nextInt();
        input.nextLine();

        System.out.print("Enter Admin Key: ");
        String aKey = input.nextLine();

        User u1 = new User("Guest");
        Developer d1 = new Developer(dName, dProjects);
        Admin a1 = new Admin(aName, aProjects, aKey);

        User[] users = {u1, d1, a1};

        int totalClearance = 0;
        for (User user : users) {
            totalClearance += user.getClearanceLevel();
        }

        for (User user : users) {
            if (user instanceof Admin) {
                Admin admin = (Admin) user;
                System.out.println(admin.getAdminKey());
            }
        }

        System.out.println(totalClearance);

        input.close();
    }
}