package Lab5.Lab5_14;
import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String trackingId, double baseFee) {
        super(trackingId, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String trackingId, double baseFee, double insuranceFee) {
        super(trackingId, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Lab5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Standard Tracking ID: ");
        String sId = input.nextLine();

        System.out.print("Enter Base Fee: ");
        double sFee = input.nextDouble();

        input.nextLine();

        System.out.print("Enter Premium Tracking ID: ");
        String pId = input.nextLine();

        System.out.print("Enter Base Fee: ");
        double pFee = input.nextDouble();

        System.out.print("Enter Insurance Fee: ");
        double pIns = input.nextDouble();

        StandardShipping sShip = new StandardShipping(sId, sFee);
        PremiumShipping pShip = new PremiumShipping(pId, pFee, pIns);

        Shipping[] shipments = {sShip, pShip};

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        input.close();
    }
}