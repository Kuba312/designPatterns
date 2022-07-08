package decorator;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.List;

public class Main {

    public static void main(String[] args) {
   //connection decorators(They don't know about their existence):
        Pizza margherita = new Pizza();
        Pizza pizzaWithHam = new WithHam(margherita);
        Pizza pizzaWithOlives = new WithOlives(pizzaWithHam);
        Pizza pizzaWithPineapple = new WithPineapple(pizzaWithOlives);

        DecimalFormat df = new DecimalFormat("0.000 zł");

        for (Pizza pizza : List.of(margherita, pizzaWithHam, pizzaWithOlives, pizzaWithPineapple)) {
            System.out.println(String.format("%s costs %s.", pizza, df.format(pizza.getBasePrice())));
        }
    }
}
