package myTrials.User;

public class User {

   private int wiek;
    private String imie;

    public User(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;

    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setWiek(int wiek) {
    this.wiek = wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}

