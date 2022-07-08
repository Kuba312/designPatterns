package abstractFactory;

public class LedLight implements Light {
    @Override
    public void produceLight() {
        System.out.println("Produce LedLight");
    }
}
