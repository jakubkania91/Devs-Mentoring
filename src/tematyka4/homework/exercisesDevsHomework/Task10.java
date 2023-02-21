package tematyka4.homework.exercisesDevsHomework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int fuelLevel;
       int numberOfAstronauts;
       int heightRocket = 0;
        int distance = 0;
       do {
           System.out.println("podaj poczatkowy poziom paliwa od 5000 do 30000: ");
           fuelLevel = scanner.nextInt();
       } while (fuelLevel <5000 || fuelLevel > 30000);

       do {
           System.out.println("podaj ilosc astronautow na pokladzie od 1 do 7: ");
           numberOfAstronauts = scanner.nextInt();
       } while (numberOfAstronauts <1 || numberOfAstronauts > 7);

        for (int i = 0; fuelLevel > 0; i++) {
            int spentFuel = 300 + 100 * numberOfAstronauts;
            fuelLevel -= spentFuel;
            distance += 100;
            heightRocket += 100;

            System.out.println("Aktualny dystans: " + distance + " km");

            if (distance >= 2000) {
                System.out.println("statek kosmiczny dotarl do orbity");
                return;
            }
        }


    }
}

