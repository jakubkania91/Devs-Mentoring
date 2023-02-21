package tematyka4.homework.exercisesDevsHomework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe k");
        int k = scanner.nextInt();

        System.out.println("Podaj przedzial a, b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
