package Lab4.Lab4_1;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + this.title + ", Author: " + this.author);
    }
}

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mode (1 or 2): ");
        int mode = input.nextInt();
        input.nextLine();

        System.out.print("Enter Title: ");
        String title = input.nextLine();

        Book book = null;

        if (mode == 1) {
            book = new Book(title);
        } else if (mode == 2) {
            System.out.print("Enter Author: ");
            String author = input.nextLine();
            book = new Book(title, author);
        }

        if (book != null) {
            book.displayInfo();
        }

        input.close();
    }
}