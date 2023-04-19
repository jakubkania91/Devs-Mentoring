package tematyka8.Task4.Zajezdnia;

import tematyka8.Task4.Pojazd.Pojazd;

import java.util.ArrayList;
import java.util.List;

abstract class Zajezdnia {
    protected String nazwa;
    protected List<Pojazd> pojazdy = new ArrayList<>();

    public Zajezdnia(String nazwa) {

        this.nazwa = nazwa;
    }
    public void dodajPojazd(Pojazd pojazd){

        pojazdy.add(pojazd);
    }
    public abstract String informacje();
}
