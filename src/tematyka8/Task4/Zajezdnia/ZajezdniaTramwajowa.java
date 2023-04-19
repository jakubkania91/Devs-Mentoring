package tematyka8.Task4.Zajezdnia;

import tematyka8.Task4.Pojazd.Pojazd;
import tematyka8.Task4.Pojazd.Tramwaj;


public class ZajezdniaTramwajowa extends Zajezdnia{
    int liczbaWagonow = 0;

    public ZajezdniaTramwajowa(String nazwa) {
        super(nazwa);
    }
    @Override
    public String informacje() {
        for (Pojazd pojazd:pojazdy) {
            System.out.println(pojazd.informacje());
        }
        return "Zajezdnia Tramwajowa " + nazwa + ", liczba wagonow " + liczbaWagonow;
    }

    @Override
    public void dodajPojazd(Pojazd pojazd) {
        super.dodajPojazd(pojazd);
        Tramwaj tramwaj = (Tramwaj) pojazd;
        liczbaWagonow += tramwaj.getLiczbaWagonow();
    }
}
