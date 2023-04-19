package tematyka8.Task4.Pojazd;
    public class Tramwaj extends Pojazd{

    private int liczbaWagonow;

        public int getLiczbaWagonow() {
            return liczbaWagonow;
        }

        public Tramwaj(int numer, double predkoscMaksymalna, int liczbaWagonow) {
        super(numer, predkoscMaksymalna);
        this.liczbaWagonow = liczbaWagonow;
    }


        @Override
        public String informacje() {

            return "Tramwaj numer " + numer + ", predkosc maksymalna: " + predkoscMaksymalna + ", liczba wagonow: " + liczbaWagonow;
        }
    }

