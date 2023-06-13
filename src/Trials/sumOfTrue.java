package Trials;

import java.util.Scanner;

public class sumOfTrue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
        int x = scanner.nextInt();
        System.out.println("Input the second number");
        int y = scanner.nextInt();
        System.out.println("Input the third number");
        int z = scanner.nextInt();
        System.out.println("The result is: " + sumoftwo(x, y, z));
        System.out.println("\n");
    }

    public static boolean sumoftwo(int p, int q, int r) {
        return ((p + q) == r || (q + r) == p || (r + p) == q);

    }
}
