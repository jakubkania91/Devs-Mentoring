package zaawansowane.tematyka4;

import java.util.stream.Stream;

public class GenericMethod {
    public static <T> void showValues(T... values) {
        System.out.println("Wprowadzony typ to: " + values.getClass());
        Stream.of(values)
                .forEach(System.out::println);
    }

    public static <T extends Number> void printNumbers(T... values) {
        Stream.of(values)
                .forEach(System.out::println);
    }
}
