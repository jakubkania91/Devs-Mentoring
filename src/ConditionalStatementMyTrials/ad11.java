package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad11 {
    public static void main(String[] args) {

        int n = 0;
        int sum = 0;
        double average;

        System.out.println("Input the 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            sum+=n;

        }
        average= (double) sum/5;
        System.out.println("The sum of 5 no is: " + sum + " The average is:  " + average);


    }
}