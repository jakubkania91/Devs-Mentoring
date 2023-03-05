package Tematyka5;

import java.util.*;

public class Task15 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("orange");
        colors.add("black");
        colors.add("pink");
        colors.add("red");
        colors.add("gray");
        colors.add("green");
        colors.add("purple");

        colors.add(0, "turquoise");
        colors.set(5, "lilac");

        for (String color : colors) {
            System.out.println(color);

        }
        System.out.println("piaty element to: " + colors.get(5));
        Collections.sort(colors);
        System.out.println(colors);

        List<String> reversedColours = new ArrayList<>();
        reversedColours.add("blue");
        reversedColours.add("orange");
        reversedColours.add("black");
        reversedColours.add("pink");
        reversedColours.add("red");
        reversedColours.add("gray");
        reversedColours.add("green");
        reversedColours.add("purple");

        System.out.println("New List: " + reversedColours);

        Collections.reverse(reversedColours);
        System.out.println("Reversed list: " + reversedColours);
    }
}
