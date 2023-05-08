package myTrials.MyTrialsall;

import java.util.Scanner;

public class sizeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo");
        String word = scanner.nextLine();
        System.out.println("Twoje slowo ma: " + word.length() + " znakow");
        System.out.println(word.charAt(0));
        System.out.println(word.contains("ków"));
        System.out.println(word.toUpperCase());
        System.out.println(word.indexOf('k'));
        System.out.println(word.startsWith("o"));
        System.out.println(word.startsWith("K"));
        System.out.println(word.isEmpty());
        System.out.println(word.trim().length());





    }
}
