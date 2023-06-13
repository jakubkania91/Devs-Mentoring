package Trials;

import java.util.Scanner;

public class numberEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int i = scanner.nextInt();
        if (i%2 ==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
