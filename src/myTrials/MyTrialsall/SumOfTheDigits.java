package myTrials.MyTrialsall;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an intiger: ");
        int digits = scanner.nextInt();
        System.out.println("Sum is: " + sumDigits(digits));
    }

    private static int sumDigits(long n) {
        int results = 0;
        while (n > 0) {
            results += n%10;
            n /= 10;
        }
        return results;
    }
}

