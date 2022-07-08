package abstractFactory;

public class EconomyCarEquipmentFactory implements CarEquipmentFactory {
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Light createLight() {
        return new Halogen();
    }

    @Override
    public Tire createTire() {
        return new BudgetTire();
    }
}
