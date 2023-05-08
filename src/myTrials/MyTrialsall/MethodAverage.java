package myTrials.MyTrialsall;

import java.util.Scanner;

public class MethodAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double y = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double z = scanner.nextDouble();
        System.out.println("The average numbers is " + average(x, y, z));
    }

    private static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

}

