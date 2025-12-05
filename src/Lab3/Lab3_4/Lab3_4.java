package Lab3.Lab3_4;
import java.util.Scanner;

class Product {
    private String name;
    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product Number: ");
        int productNumber = input.nextInt();

        input.nextLine();

        for (int i = 0; i < productNumber; i++) {
            System.out.print("Enter Product Name: ");
            String productName = input.nextLine();

            new Product(productName);
        }

        System.out.println(Product.getProductCount());

        input.close();
    }
}
