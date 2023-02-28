package Tematyka5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapFirst {
    public static void main(String[] args) {
        Map<String, String> whoWantsWhat = new HashMap<>();

        whoWantsWhat.put("Karol", "Pizza");
        whoWantsWhat.put("Agnieszka", "Krewetki");
        whoWantsWhat.put("Roman", "Burger");

        System.out.println(whoWantsWhat);
        Set<String> keys = whoWantsWhat.keySet();
        System.out.println(keys);

        Collection<String> values = whoWantsWhat.values();
        System.out.println(values);

        boolean containsKey = whoWantsWhat.containsKey("Krzysiek");
        System.out.println(containsKey);

        boolean containsValue = whoWantsWhat.containsValue("Krewetki");
        System.out.println(containsValue);

        String result = whoWantsWhat.get("Agnieszka");
        System.out.println(result);

        String chose = whoWantsWhat.get("Roman");
        System.out.println(chose);

        boolean empty = whoWantsWhat.isEmpty();
        System.out.println(empty);

        for (Map.Entry<String, String> entry : whoWantsWhat.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
