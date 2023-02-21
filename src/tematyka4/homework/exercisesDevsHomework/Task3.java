package tematyka4.homework.exercisesDevsHomework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita");
        int y = scanner.nextInt();

        for (int i = 0; i <= y; i++) {
            System.out.println(i + " ");


            int j = 0;
            while (j <= y) {
                System.out.println(j + " ");
                j++;
            }
        }
    }
}

