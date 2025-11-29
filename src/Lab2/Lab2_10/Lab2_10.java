package Lab2.Lab2_10;
import java.util.Scanner;

public class Lab2_10 {

    public static class Product {

        private String name;
        private double price;

        public Product(String name, double price)  {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return this.price;
        }
    }

    public static class ShoppingCart  {
        Product[] items = new Product[10];
        int itemCount = 0;

        public void addProduct(Product p) {
            items[itemCount] = p;
            itemCount++;
        }

        public double calculateTotalPrice() {
            double sum = 0.0;
            for (int i = 0; i < itemCount; i++) {
                sum = sum + items[i].getPrice();
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product Number(Max10): ");
        int productCount = input.nextInt();

        ShoppingCart cart = new ShoppingCart();
        for (int i = 0; i < productCount; i++) {

            input.nextLine();

            System.out.print("Enter Product Name: ");
            String pname = input.nextLine();

            System.out.print("Enter Product Price: ");
            double price = input.nextDouble();

            Product products = new Product(pname, price);

            cart.addProduct(products);
        }

        System.out.println("Total price: " + cart.calculateTotalPrice());

        input.close();

    }
}
