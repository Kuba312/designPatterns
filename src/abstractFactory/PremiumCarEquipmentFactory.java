package abstractFactory;

public class PremiumCarEquipmentFactory implements CarEquipmentFactory{
    @Override
    public Engine createEngine() {
        return new HybridEngine();
    }

    @Override
    public Light createLight() {
        return new LedLight();
    }

    @Override
    public Tire createTire() {
        return new PremiumTire();
    }
}
