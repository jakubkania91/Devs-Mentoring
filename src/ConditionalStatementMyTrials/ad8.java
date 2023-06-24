package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the year: ");
        int yearUser = scanner.nextInt();

        boolean x = (yearUser % 4) == 0;
        boolean y = (yearUser % 100 == 0) && (yearUser % 400 == 0);
        boolean z = (yearUser % 100) != 0;

        if (x && (y||z)){
            System.out.println(yearUser + " is a leap year");
        }else {
            System.out.println(yearUser + " is not a leap yeat");
        }
    }
}
