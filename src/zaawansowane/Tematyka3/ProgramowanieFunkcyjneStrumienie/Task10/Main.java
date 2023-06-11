package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Burek", 3));
        animals.add(new Cat("Milelon", 4));
        animals.add(new Dog("Puszek", 2));
        animals.add(new Dog("Zorka", 2));
        animals.add(new Cat("Filemon", 1));

       List<String> animal = new ArrayList<>();
       animals.stream()
               .map(anima ->anima.getName() + " is a " + anima.getType()+ " and has " + anima.getNoEyes() + " eye")
               .forEach(animal::add);

        for (String anima:animal) {
            System.out.println(anima);

        }

    }
}



