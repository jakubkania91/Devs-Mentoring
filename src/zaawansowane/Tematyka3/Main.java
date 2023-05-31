package zaawansowane.Tematyka3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        1.Przefiltruj liste w poszukiwanie Hello i World
        2. Przemapuj je napisane z dużej litery
        3. Wypisz je w konsoli
         */
        List<String> strings = List.of("Hello", "World", "Devs", "Mentoring", "Students", "Java");

        strings.stream()
                .filter(word -> word.equals("Hello") || word.equals("World"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
