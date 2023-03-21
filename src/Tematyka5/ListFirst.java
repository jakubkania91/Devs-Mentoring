package Tematyka5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFirst {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Karol");
        names.add("Roman");
        names.add("Adam");
        names.add("Zbyszek");
        names.add("Stefan");

        System.out.println(names);
        names.remove("Karol");
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);

        String name = names.get(2);
        System.out.println(name);

        boolean result = names.contains("Zbyszek");
        System.out.println(result);

        for (String element : names) {
            System.out.println(element);

        }
    }
}
