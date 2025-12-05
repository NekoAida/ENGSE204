package Lab3.Lab3_8;
import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public int getStock() {
        return this.stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0 && amount <= this.stock) {
            this.stock -= amount;
            System.out.println("Sale successful.");
        } else if (amount > this.stock) {
            System.out.println("Not enough stock.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

public class Lab3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String name = input.nextLine();

        System.out.print("Enter Initial Stock: ");
        int initialStock = input.nextInt();

        InventoryItem item = new InventoryItem(name, initialStock);

        System.out.print("Enter Number Item: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            String command = input.next();

            int amount = input.nextInt();

            if (command.equalsIgnoreCase("ADD")) {
                item.addStock(amount);
            } else if (command.equalsIgnoreCase("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());

        input.close();
    }
}