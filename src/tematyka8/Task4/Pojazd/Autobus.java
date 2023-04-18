package tematyka8.Task4.Pojazd;

public class Autobus extends Pojazd{

    private double zuzyciePaliwa;

    public Autobus(int numer, double predkoscMaksymalna, double zuzyciePaliwa) {
        super(numer, predkoscMaksymalna);
        this.zuzyciePaliwa = zuzyciePaliwa;
    }

    @Override
    public String informacje() {
        return "Autobus numer " + numer + ", predkoscMaksymalna: " + predkoscMaksymalna;
    }
}
