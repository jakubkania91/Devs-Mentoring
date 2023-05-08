package myTrials.MyTrialsall;

import java.util.Scanner;

public class MesthodSmallerNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double y = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double z = scanner.nextDouble();
        System.out.println("The smallest number is " + smallest(x, y, z) + "\n");


    }

    private static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }
}
