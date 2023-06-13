package Trials;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Number");
        int n = scanner.nextInt();

        for (int i = 0; i < 12; i++) {
            System.out.println(n + "*" + i + " = " + (n*i));

        }
    }
}
