package zaawansowane.tematyka4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericMethod.showValues(1, 5, 7, 10);
        System.out.println("\n");
        GenericMethod.showValues("pawel", "ania", "sylwia");

        GenericMethod.printNumbers(1, 50, 60);

        DataStoragre<Integer> integerDataStoragre = new DataStoragre<>(List.of(1, 2, 3, 4));
        List<Integer> revers = integerDataStoragre.revers();
        System.out.println(revers);

    }
}
