package decoratorHomeWork;

public class PotatoMeal extends Meal {
    public PotatoMeal() {
    }

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje ziemniaki.");
    }
}
