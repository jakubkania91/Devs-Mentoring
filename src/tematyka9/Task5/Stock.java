package tematyka9.Task5;

import java.math.BigDecimal;
import java.util.Random;

public class Stock extends Security{


    public Stock(BigDecimal value, int id) {
        super(value, id);
    }

    @Override
    public void step() {
        Random random = new Random();
        int sign;
        if (random.nextBoolean()){
            sign = 1;
        }else {
            sign = -1;
            BigDecimal change = getValue().multiply(new BigDecimal(0.1)).multiply(new BigDecimal(sign));
            setValue(getValue().add(change));
            // wykorzystywanie elementów z którychh się w kółko korzysta;
        }
    }
}
