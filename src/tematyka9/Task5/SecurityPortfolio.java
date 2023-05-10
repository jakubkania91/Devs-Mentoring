package tematyka9.Task5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class SecurityPortfolio {

private Iterable<Security> securities;

    public SecurityPortfolio(Iterable<Security> securities) {
        this.securities = securities;
    }

    public void step() {
        for (Security security:securities) {
            security.step();
        }
    }
    public BigDecimal getValue(){
        BigDecimal totalValue = BigDecimal.ZERO;
        for (Security security:securities) {
            totalValue = totalValue.add(security.getValue());
        }
        return totalValue;
    }
}
