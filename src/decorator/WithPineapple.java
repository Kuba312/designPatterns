package decorator;

import java.math.BigDecimal;

public class WithPineapple extends Pizza {
    private static final BigDecimal PINEAPPLE_PRICE = BigDecimal.valueOf(4);
    private final Pizza basePizza;


    public WithPineapple(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public BigDecimal getBasePrice() {
        return basePizza.getBasePrice().add(PINEAPPLE_PRICE);
    }
}
