package abstractFactory;

public class PetrolEngine implements Engine {
    @Override
    public void produceEngine() {
        System.out.println("Producing petrol engine.");
    }
}
