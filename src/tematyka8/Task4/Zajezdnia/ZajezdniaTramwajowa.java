package tematyka8.Task4.Zajezdnia;

import tematyka8.Task4.Pojazd.Pojazd;


public class ZajezdniaTramwajowa extends Zajezdnia{

    public ZajezdniaTramwajowa(String nazwa) {
        super(nazwa);
    }

    @Override
    public String informacje() {
        int liczbaWagonow = 0;

        for (Pojazd pojazd:pojazdy) {
            System.out.println(pojazd.informacje());

        }

        return "Zajezdnia Tramwajowa " + nazwa + ", liczba wagonów " + liczbaWagonow;
    }
}
