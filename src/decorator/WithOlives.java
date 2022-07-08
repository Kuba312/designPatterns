package decorator;

import java.math.BigDecimal;

public class WithOlives extends Pizza {
    private static final BigDecimal OLIVES_PRICE = BigDecimal.valueOf(4);
    private final Pizza basePizza;

    public WithOlives(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public BigDecimal getBasePrice() {
        return basePizza.getBasePrice().add(OLIVES_PRICE);
    }
}
