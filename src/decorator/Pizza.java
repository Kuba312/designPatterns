package decorator;

import java.math.BigDecimal;

public class Pizza {
    private static final BigDecimal BASE_PRICE = BigDecimal.valueOf(12);

    public  BigDecimal getBasePrice() {
        return BASE_PRICE;
    }
}
