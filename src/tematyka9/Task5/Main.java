package tematyka9.Task5;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Security> securities = new ArrayList<>();
        securities.add(new Debenture(new BigDecimal("1000.00"), 1, new BigDecimal("0,05")));
        securities.add(new Stock(new BigDecimal("50.00"), 2));
        SecurityPortfolio securityPortfolio = new SecurityPortfolio(securities);

        System.out.println("Initial portfolio value: " + securityPortfolio.getValue());
        securityPortfolio.step();
        System.out.println("Portfolio value after one step: " + securityPortfolio.getValue());


    }
}
