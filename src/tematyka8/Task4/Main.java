package tematyka8.Task4;

import tematyka8.Task4.Pojazd.Autobus;
import tematyka8.Task4.Pojazd.Tramwaj;
import tematyka8.Task4.Zajezdnia.ZajezdniaAautobusowa;
import tematyka8.Task4.Zajezdnia.ZajezdniaTramwajowa;

public class Main {
    public static void main(String[] args) {
        Tramwaj tramwaj1 = new Tramwaj(80,70,100);
        Tramwaj tramwaj2 = new Tramwaj(25, 150, 20);
        Autobus autobus1 = new Autobus(15, 69, 10);
        Autobus autobus2 = new Autobus(28, 80, 6);

        ZajezdniaTramwajowa zajezdniaTramwajowa = new ZajezdniaTramwajowa("PKP Warszawa");
        ZajezdniaAautobusowa zajezdniaAautobusowa = new ZajezdniaAautobusowa("PKS Lublin");

        zajezdniaAautobusowa.dodajPojazd(autobus1);
        zajezdniaAautobusowa.dodajPojazd(autobus2);
        zajezdniaTramwajowa.dodajPojazd(tramwaj1);
        zajezdniaTramwajowa.dodajPojazd(tramwaj2);

        System.out.println(zajezdniaTramwajowa.informacje());
        System.out.println(zajezdniaAautobusowa.informacje());
    }
}
