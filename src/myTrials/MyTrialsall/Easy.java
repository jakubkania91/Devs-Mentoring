package myTrials.MyTrialsall;

import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Wpisz liczbe A: ");
        double a = myScanner.nextDouble();
        System.out.println("Wpisz liczbe B: ");
        int b = myScanner.nextInt();

        System.out.println("Srednia: " + (double)((a+b)/2));



    }
}
