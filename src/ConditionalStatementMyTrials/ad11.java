package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad11 {
    public static void main(String[] args) {

        int n = 0;
        int sum=0;
        double average;

        {
            System.out.println("Input 5 numbers: ");
        }
        for (int i = 0; i < 5 ; i++) {

            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            sum+=n;

            System.out.println("Sum numbers is: " + sum);
        }

        System.out.println("Average this numbers are: " + sum/n);


    }
}
