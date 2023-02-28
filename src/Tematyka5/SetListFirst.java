package Tematyka5;

import java.util.HashSet;
import java.util.Set;

public class SetListFirst {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Karol");
        names.add("Roman");
        names.add("Adam");
        names.add("Zbyszek");
        names.add("Stefan");
        names.add("Stefan");
        names.add("Karol");

        System.out.println(names);
        names.remove("Karol");
        System.out.println(names);
        boolean result = names.contains("Piotrek");
        System.out.println(result);
        boolean results = names.isEmpty();
        System.out.println(results);
        System.out.println(names.size());

        for (String element : names) {
            System.out.println(element);
        }

    }
}
