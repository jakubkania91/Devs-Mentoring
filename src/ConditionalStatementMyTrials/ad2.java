package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        if (num1>num2)
            if (num1>num3)
                System.out.println("The greatest number is: " + num1);

        if (num2>num1)
            if (num2>num3)
                System.out.println("The greatest number is: " + num2);

        if (num3>num1)
            if (num3>num2)
                System.out.println("the greatest number is: " + num3);
    }
}
