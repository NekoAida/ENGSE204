package Lab5.Lab5_1;
import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String inputName = input.nextLine();

        System.out.print("Enter Age: ");
        int inputAge = input.nextInt();

        Dog myDog = new Dog();
        myDog.name = inputName;
        myDog.age = inputAge;

        myDog.makeSound();
        myDog.displayInfo();

        input.close();
    }
}