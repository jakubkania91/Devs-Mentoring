package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad14 {
    public static void main(String[] args) {

        int n;
        int sum = 0;

        System.out.println("Input number of terms is: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(2*i - 1);
            sum+=2*i-1;

        }
        System.out.println("The Sum of odd Natural Number upto " +n+ " terms is: " + sum);
    }
}
