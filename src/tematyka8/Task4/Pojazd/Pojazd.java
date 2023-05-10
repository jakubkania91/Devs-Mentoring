package tematyka8.Task4.Pojazd;

 public abstract class Pojazd {

    protected double predkoscMaksymalna;
    protected int numer;

    public Pojazd(int numer, double predkoscMaksymalna){
        this.numer = numer;
        this.predkoscMaksymalna = predkoscMaksymalna;
    }
    public abstract String informacje();
}
