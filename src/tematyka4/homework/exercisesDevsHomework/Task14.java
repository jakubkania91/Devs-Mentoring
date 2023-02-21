package tematyka4.homework.exercisesDevsHomework;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Wybierz opcje:");
            System.out.println("1. Wyswietl ilosc kursantow");
            System.out.println("2. Wyswietl nazwe firmy");
            System.out.println("3. Wyswietl rok zalozenia firmy");
            System.out.println("4. Wyjdz");

           choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Liczba kursantow: 70");
                    break;
                case 2:
                    System.out.println("Nazwa firmy: Devs-Mentoring.pl");
                    break;
                case 3:
                    System.out.println("Rok zalozenia firmy: 2021");
                    break;
                case 4:
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Zly wybor");
                    break;
            }
        } while (choice != 4);

    }
}
