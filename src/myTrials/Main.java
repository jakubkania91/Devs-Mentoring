package myTrials;

public class Main {

    public static void main(String[] args) {

        Garnek garnek = new Garnek(7, 5, "Srebny");

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomosc2 = garnek.gotuj(true);
        System.out.println(wiadomosc2);

        int temperatura = garnek.zwrocTemperatureWrzeniaWody();
        System.out.println(temperatura);

        garnek.gotujBezInformacji();

    }
}

