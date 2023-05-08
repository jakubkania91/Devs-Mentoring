package myTrials.MyTrialsall;

import java.util.Scanner;

public class CountWordsMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the words string: ");
        String wordsString = scanner.nextLine();
        System.out.println("Number of words in the string: " + countWords(wordsString));


    }

    private static int countWords(String wordsString) {
        int count = 0;
        if (!(" ".equals(wordsString.substring(0, 1))) || !(" ".equals((wordsString.substring(wordsString.length() - 1))))) {

            for (int i = 0; i < wordsString.length(); i++) {

                if (wordsString.charAt(i) == ' ') {
                    count++;

                }
                count = count + 1;
            }
        }
        return count;
    }
}


