package tematyka4.homework.exercisesDevsHomework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int potega = (int) Math.pow(2, i); // czy tu się dało inaczej jakoś zrobić ?
            System.out.println(potega);
        }
    }
}
