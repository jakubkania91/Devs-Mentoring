package tematyka9.Task5;

import java.math.BigDecimal;

public class Debenture extends Security {

    private BigDecimal interestRate;

    public Debenture(BigDecimal value, int id, BigDecimal interestRate) {
        super(value, id);
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void step() {
        BigDecimal interest = getValue().multiply(interestRate);
        setValue(getValue().add(interest));
    }
}
