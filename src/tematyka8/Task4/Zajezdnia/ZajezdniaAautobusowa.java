package tematyka8.Task4.Zajezdnia;

import com.sun.source.tree.IfTree;
import tematyka8.Task4.Pojazd.Autobus;
import tematyka8.Task4.Pojazd.Pojazd;

public class ZajezdniaAautobusowa extends Zajezdnia {
     int zuzyciePaliwa;

    public ZajezdniaAautobusowa(String nazwa) {
        super(nazwa);
    }

    @Override
    public String informacje() {

        for (Pojazd pojazd : pojazdy) {
            System.out.println(pojazd.informacje());

        }

        return "Zajezdnia autobusowa " + nazwa + " zuzycie paliwa " + zuzyciePaliwa;
    }

    @Override
    public void dodajPojazd(Pojazd pojazd) {
        super.dodajPojazd(pojazd);
        Autobus autobus = (Autobus) pojazd;
        zuzyciePaliwa += autobus.getZuzyciePaliwa();
    }
}



