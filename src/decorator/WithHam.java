package decorator;

import java.math.BigDecimal;

public class WithHam extends Pizza {
    private static final BigDecimal WITH_HAM_PRICE = BigDecimal.valueOf(4);
    private final Pizza basePizza;


    public WithHam(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public BigDecimal getBasePrice() {
        return basePizza.getBasePrice().add(WITH_HAM_PRICE);
    }


}
