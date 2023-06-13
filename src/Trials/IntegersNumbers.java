package Trials;

import java.util.Scanner;

public class IntegersNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
        int x = scanner.nextInt();
        System.out.println("Input the second number");
        int y = scanner.nextInt();
        System.out.println("Input the third number");
        int z = scanner.nextInt();
        System.out.println("The result is: " + testLastDigit(x, y, z, true));
        System.out.println("\n");
    }

    public static boolean testLastDigit(int p, int q, int r, boolean xyz) {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}

