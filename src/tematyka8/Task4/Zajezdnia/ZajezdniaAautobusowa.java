package tematyka8.Task4.Zajezdnia;

import com.sun.source.tree.IfTree;
import tematyka8.Task4.Pojazd.Autobus;
import tematyka8.Task4.Pojazd.Pojazd;

public class ZajezdniaAautobusowa extends Zajezdnia {


    public ZajezdniaAautobusowa(String nazwa) {
        super(nazwa);
    }

    @Override
    public String informacje() {
        double zuzyciePaliwa = 0;

        for (Pojazd pojazd : pojazdy) {
            System.out.println(pojazd.informacje());

        }

        return "Zajezdnia autobusowa " + nazwa + " zuzycie paliwa " + zuzyciePaliwa;
    }
}



