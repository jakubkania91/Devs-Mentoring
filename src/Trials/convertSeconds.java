package Trials;

import java.util.Scanner;

public class convertSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds = scanner.nextInt();

        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H=H / 60;
        System.out.println(H+ ":" + M + ":" + S);
        System.out.println();
    }
}
