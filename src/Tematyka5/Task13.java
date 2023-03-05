package Tematyka5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> wordsUser = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String userWord = "";

        while (!userWord.equals("STOP")) {
            System.out.println("Podaj wyraz lub wpisz STOP: ");
            userWord = scanner.nextLine();
            if (!userWord.equals("STOP")) {
                wordsUser.add(userWord);
            }
            System.out.println(wordsUser);
            System.out.println("Lista ma rozmiar: " + wordsUser.size() + " pierwszy element listy to: " + wordsUser.get(0) + " drugi element listy to: " + wordsUser.get(wordsUser.size() / 2) + " ostatni element lity to: " + wordsUser.get(wordsUser.size() - 1));
        }
    }
}


