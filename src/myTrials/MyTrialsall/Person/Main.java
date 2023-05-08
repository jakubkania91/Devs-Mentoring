package myTrials.MyTrialsall.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Pawel", 23);
        Person person1 = new Person("Kasia", 40);
        System.out.println(person.getName() + " ma " + person.getAge() + " lata");
        System.out.println(person1.getName() + " ma " + person1.getAge() + " lata");
    }
}
