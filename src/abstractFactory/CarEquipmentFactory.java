package abstractFactory;

public interface CarEquipmentFactory {
    Engine createEngine();
    Light createLight();
    Tire createTire();
}
