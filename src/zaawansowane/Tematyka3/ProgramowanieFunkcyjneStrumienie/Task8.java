package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {

        Stream.iterate(100, n -> n + 2)
                .limit(Long.MAX_VALUE)
                .filter(n->n >= 100 && n <= 999)
                .forEach(System.out::println);
    }
}
