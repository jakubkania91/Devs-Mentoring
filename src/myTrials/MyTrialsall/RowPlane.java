package myTrials.MyTrialsall;

import java.util.Scanner;

public class RowPlane {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe siedzen: ");
        int seats = scanner.nextInt();

        System.out.println("Podaj liczbe rzedow: ");
        int rows = scanner.nextInt();

        if (seats % rows == 0){
            System.out.println("Rzad ma: " + seats/rows + " siedzen");
        }else {
            System.out.println("Rzad ma: " + seats/rows + " siedzen");
            System.out.println("A ostatni: " + seats%rows);
        }

    }
}
