package Tematyka5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task20 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("zielony");
        colors.add("czerwony");
        colors.add("niebieski");
        colors.add("czarny");
        colors.add("fioletowy");
        colors.add("granatowy");
        colors.add("niebieski");
        colors.add("czarny");
        colors.add("czarny");
        colors.add("zielony");
        colors.add("cytrynowy");
        colors.add("granatowy");
        colors.add("niebieski");
        colors.add("indygo");
        colors.add("zielony");
        colors.add("czerwony");

        Set<String> newSetColors = new HashSet<>(colors);
        System.out.println(newSetColors);

        // a jeśli bym chciał przeiterować foreachem po zbiorze to czemu nie mogę?

        System.out.println(colors.size());
        System.out.println(newSetColors.size());
        System.out.println("zielony\nczerwony\nfioletowy\nczarny\nindygo\ngranatowy\ncytrynowy\nniebieski"); // tu wiem ze mozna jakoś inaczej chyba niż tak

        newSetColors.add("rozowy");
        System.out.println(newSetColors);

        newSetColors.remove("granatowy");
        System.out.println(newSetColors);
        }

    }
