package abstractFactory;

public class Halogen implements Light {
    @Override
    public void produceLight() {
        System.out.println("Producing halogen light.");
    }
}
