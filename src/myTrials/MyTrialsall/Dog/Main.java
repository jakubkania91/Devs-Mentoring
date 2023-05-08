package myTrials.MyTrialsall.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Pikus", "jamnik");
        Dog dog1 = new Dog("Roki", "pitbull");
        System.out.println(dog.getName() + " jest rasy " + dog.getBreed());
        System.out.println(dog1.getName() + " jest rasy " + dog1.getBreed());

        System.out.println("\nUstaw nowa rase dog i nowa nazwe dog1:");

        dog.setBreed("kundel");
        dog1.setName("Guzik");

        System.out.println(dog.getName() + " jest teraz " + dog.getBreed());
        System.out.println(dog1.getName() + " jest teraz " + dog1.getBreed());
    }
}
