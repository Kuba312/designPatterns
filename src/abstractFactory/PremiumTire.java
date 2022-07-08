package abstractFactory;

public class PremiumTire implements Tire {
    @Override
    public void produceTire() {
        System.out.println("Produce PremiumTire.");
    }
}
