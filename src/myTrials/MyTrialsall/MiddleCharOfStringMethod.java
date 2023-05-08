package myTrials.MyTrialsall;

import java.util.Scanner;

public class MiddleCharOfStringMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String: ");
        String number = scanner.nextLine();
        System.out.println("The middle character in the string: " + middle(number));
    }

    public static String middle(String number) {

        int position;
        int lenght;
        if (number.length()%2 ==0) {
            position = number.length()/2 -1;
            lenght = 2;
        }else {
            position = number.length()/2;
            lenght = 1;
        }
        return number.substring(position, position + lenght);

    }
}

