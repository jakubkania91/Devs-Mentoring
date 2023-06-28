package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad12 {
    public static void main(String[] args) {

        int n;
        int i;
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i = 1; i < n; i++) {

            System.out.println("Number is: " + i+ " and cube of " +i+ " is: " + (i * i * i));
        }


    }
}
