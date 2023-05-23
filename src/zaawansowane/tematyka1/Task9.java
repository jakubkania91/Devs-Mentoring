package zaawansowane.tematyka1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe zmiennoprzecinkowa");
        String numberUser = scanner.nextLine();

        boolean isValid = validateNumber(numberUser);
        System.out.println("Czy liczba ma poprawny foramt? " + isValid);


    }

    private static boolean validateNumber(String numberUser) {
        String numberPattern = "^[-+]?\\d+(\\.\\d+)$";
        return Pattern.matches(numberPattern, numberUser);
    }
}
