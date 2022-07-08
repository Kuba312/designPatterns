package decoratorHomeWork;

public class RiceMeal extends Meal {

    public RiceMeal() {
    }

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje ryż.");
    }
}
