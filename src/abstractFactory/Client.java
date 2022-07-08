package abstractFactory;

public class Client {

    public static void main(String[] args) {

        createEquipment(new EconomyCarEquipmentFactory());
        createEquipment(new PremiumCarEquipmentFactory());
    }



    private static void createEquipment(CarEquipmentFactory carEquipmentFactory) {
        Engine engine = carEquipmentFactory.createEngine();
        engine.produceEngine();

        Light light = carEquipmentFactory.createLight();
        light.produceLight();

        Tire tire = carEquipmentFactory.createTire();
        tire.produceTire();
    }
}
