package Tematyka5;

import java.util.HashMap;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) {

        Map<String,String> register = new HashMap<>();

        register.put("Karol", "91080600251");
        register.put("Agata", "89050805268");
        register.put("Pawel", "98120470442");
        register.put("Marysia", "65100987612");
        register.put("Anna", "85021498456");

        boolean containsKey = register.containsKey("Anna");
        System.out.println(containsKey);

        for (String pesel : register.values()) {
            System.out.println(pesel.startsWith("9")); // tutaj coś chyba nie tak zrobiłem

        register.remove("Karol","91080600251");
        register.remove("Marysia","65100987612");

            System.out.println(register);

            System.out.println("Rozmiar mapy wynosi: " + register.size());
            System.out.println("The map's size is correct");

            String result = register.get("Euzebiusz"); // tu coś zepsułem
            if (true) {
                System.out.println("No such name");
            }
             boolean result1 = register.isEmpty();
            if (register.isEmpty()){
                System.out.println("Nothing to do here");
            } else if (!register.isEmpty()) {
                System.out.println("Rozmiar mapy wynosi: " + register.size());

                System.out.println(result1);
            }

        }

    }
}
