package myTrials.MyTrialsProgrammimgOOP;

public class Main {
    public static void main(String[] args) {
        Object dog1 = new Dog();
        Animal dog2 = new Dog();
        Mammals dog3 = new Dog();
        Dog dog4 = new Dog();

        dog1.toString();
        dog2.eat();
        dog2.sleep();
        dog3.gaveBirth();
        dog4.bark();
        dog4.gaveBirth();
        dog4.eat();
        dog4.sleep();

        System.out.println("================");

       // Fish fish = new Fish();
       // fish.eat();
      //  fish.sleep();

        System.out.println("=================");

        Animal bird = new Bird();
        Animal dog = new Dog();
        Animal fish = new Fish();
        Animal hamster = new Hamster();

        System.out.println(bird.getClass());


    }
}
