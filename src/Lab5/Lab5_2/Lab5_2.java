package Lab5.Lab5_2;
import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String inputName = input.nextLine();

        System.out.print("Enter Age: ");
        int inputAge = input.nextInt();

        Cat myCat = new Cat();
        myCat.name = inputName;
        myCat.age = inputAge;

        myCat.displayInfo();
        myCat.makeSound();

        input.close();
    }
}