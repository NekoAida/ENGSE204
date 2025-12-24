package Lab5.Lab5_12;
import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class Lab5_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Basic Service Name: ");
        String bName = input.nextLine();

        System.out.print("Enter Base Price: ");
        double bPrice = input.nextDouble();

        input.nextLine();

        System.out.print("Enter Premium Service Name: ");
        String pName = input.nextLine();

        System.out.print("Enter Base Price: ");
        double pPrice = input.nextDouble();

        System.out.print("Enter Premium Rate: ");
        double pRate = input.nextDouble();

        BasicService basic = new BasicService(bName, bPrice);
        PremiumService premium = new PremiumService(pName, pPrice, pRate);

        Service[] services = {basic, premium};

        for (Service s : services) {
            System.out.println(s.calculateFinalPrice());
        }

        input.close();
    }
}