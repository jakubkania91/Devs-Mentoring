package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = scanner.nextInt();
        int count = 1;
        int noOfSpaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) {
            for (int k = n- noOfSpaces; k > 0 ; k--) {
                System.out.print(" ");
            }
            if (i<n){
                start=i;
                noOfSpaces++;
            }else {
                start = n*2-i;
                noOfSpaces--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j<count/2){
                    start--;
                }else {
                    start++;
                }
            }
            if (i<n){
                count=count+2;
            }else {
                count=count - 2;
            }
            System.out.println();
        }
    }
}
