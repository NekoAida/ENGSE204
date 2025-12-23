package Lab5.Lab5_9;
import java.util.Scanner;

class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class Lab5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String pName = input.nextLine();

        System.out.print("Enter Unit Price: ");
        double pPrice = input.nextDouble();

        System.out.print("Enter Quantity: ");
        int pQty = input.nextInt();
        input.nextLine();

        System.out.print("Enter Subscription Name: ");
        String sName = input.nextLine();

        System.out.print("Enter Monthly Cost: ");
        double sCost = input.nextDouble();

        System.out.print("Enter Months: ");
        int sMonths = input.nextInt();

        PhysicalProduct product = new PhysicalProduct(pName, pPrice, pQty);
        DigitalSubscription sub = new DigitalSubscription(sName, sCost, sMonths);

        Item[] items = {product, sub};

        double totalValue = 0;
        for (Item item : items) {
            totalValue += item.getValue();
        }

        System.out.println(totalValue);

        input.close();
    }
}