package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        double valueUser = scanner.nextDouble();

        if (valueUser >0) {
            if (valueUser < 1) {
                System.out.println("Positive small number");
            } else if (valueUser > 100000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        } else if (valueUser<0) {
            if (Math.abs(valueUser)<1){
                System.out.println("Negative small number");
            } else if (Math.abs(valueUser)>100000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        }
        else {
            System.out.println("Zero");
        };
    }
}
