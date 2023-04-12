package myTrials.User;

public class User {

    private int wiek;
    private String imie;

    public User(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;


    }





    public boolean czyMozeLegalnieKupicAlkohol() {
        if (wiek >=18) {
            return true;
        } else {
            return false;
        }
    }
}
