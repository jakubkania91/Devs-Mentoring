package myTrials;

public class Garnek {
    int srednica;
    int wysokosc;
    String kolor;

    public Garnek() {
        this.srednica = 10;
        this.wysokosc = 5;
    }

    public Garnek(int srednica, int wysokosc, String kolor) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;

    }

    public String gotuj() {
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol) {
        if (czyDodalismySol) {
            return "Gotowanie z sola";
        } else {
            return "Gotowanie bez soli";
        }
    }
    public void gotujBezInformacji(){
        wlaczGarnek();
        gotujPrzezPolGodziny();
        wylaczGarnek();
    }
    private void wlaczGarnek() {
        System.out.println("Wlaczanie garnka");
    }
    private void gotujPrzezPolGodziny() {
        System.out.println("Gotowanie przez 30minut");
    }
    private void wylaczGarnek(){
        System.out.println("Wylaczanie garnka");
    }
    public int zwrocTemperatureWrzeniaWody() {
        return 100;
    }
}