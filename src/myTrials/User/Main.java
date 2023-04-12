package myTrials.User;

public class Main {
    public static void main(String[] args) {

        User mariusz = new User(20, "Mariusz");


        if (mariusz.czyMozeLegalnieKupicAlkohol()) {
            System.out.println("Moze kupic");
        }else {
            System.out.println("Nie moze kupic");
        }

    }
}
