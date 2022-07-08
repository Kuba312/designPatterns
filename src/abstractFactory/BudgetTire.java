package abstractFactory;

public class BudgetTire implements Tire {
    @Override
    public void produceTire() {
        System.out.println("Producing budget tire.");
    }
}
