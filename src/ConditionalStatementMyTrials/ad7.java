package ConditionalStatementMyTrials;

import java.util.Locale;
import java.util.Scanner;

public class ad7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        String input = scanner.nextLine();
        
        boolean uppercase = input.charAt(0) >= 'A' && input.charAt(0) <= 'Z';
        boolean lowercase = input.charAt(0) >= 'a' && input.charAt(0) <= 'z';
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");
        
        if (input.length() > 1){
            System.out.println("Error. Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lawercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }

    }
}
