package Lab1_12;
import java.util.Scanner;
public class Lab1_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product number: ");
        int number = input.nextInt();

        int[] productId = new int[number];
        int[] stockProduct = new int[number];

        System.out.println("Enter Product Details");
        for (int i = 0; i < number; i++) {
            System.out.println("Product #" + (i + 1));

            System.out.print("Enter ID: ");
            productId[i] = input.nextInt();

            System.out.print("Enter stockProduct");
            stockProduct[i] = input.nextInt();
        }

        System.out.print("Enter Search ID: ");
        int searchId = input.nextInt();

        boolean isFound = false;
        int foundStock = 0;

        for (int i = 0; i < number; i++) {
            if (productId[i] == searchId) {
                foundStock = stockProduct[i];
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Stock Product: " + foundStock);
        } else {
            System.out.println("Produtc" + searchId + "Not Found");
        }
    }
}