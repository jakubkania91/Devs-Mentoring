package pl.devsmentoring.module_4_loops.excercises;

import java.util.Scanner;

public class InfiniteWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Wypisz liczbę pomiędzy 300 a 550: ");
            int nextInt = scanner.nextInt();
            if (nextInt>=300 && nextInt<=550){
                break;
            }
        }
    }
}
