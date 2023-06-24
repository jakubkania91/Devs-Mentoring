package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int i = scanner.nextInt();

        if (i>0){
            System.out.println("Number is positive");
        } else if (i<0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

}
