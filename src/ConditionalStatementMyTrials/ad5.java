package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Input floating-point anather number: ");
        double num2 = scanner.nextDouble();

        num1 = Math.round(num1 * 1000);
        num1 = num1 / 1000;
        num2 = Math.round(num2 * 1000);
        num2 = num2 / 1000;

        if (num1 == num2) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}
