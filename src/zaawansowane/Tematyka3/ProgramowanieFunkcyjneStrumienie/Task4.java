package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 5, 17, 24, 33, 45, 50, 20, 24, 120, 133);

        System.out.println("Liczby nieprzyste");
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);

        System.out.println("\nLiczby dwucyfrowe");
        numbers.stream()
                .filter(number -> number >= 10 && number <= 99)
                .forEach(System.out::println);
    }
}
