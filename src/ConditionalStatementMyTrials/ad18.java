package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad18 {
    public static void main(String[] args) {

        int i,j,n,s,x;

        System.out.println("Input number of rows: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        s = n +4 -1;
        for ( i = 1; i <=n ; i++) {
            for (x = s; x!=0; x--) {
                System.out.print(" ");
            }
            for (j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
            s--;
        }

    }
}
