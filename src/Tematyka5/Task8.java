package Tematyka5;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};

        int treeDigitNumbers = 0;

        for (int number : numbers) {
            if (number >= 100 && number < 1000) {
                treeDigitNumbers++;
            }
        }
        System.out.println("Trzycyfrowych liczb w tablicy numbers jest: " + treeDigitNumbers);

        int treeDigitNumbers1 = 0;

        for (int[]array: numbers2D) {
            for (int number:array) {
                if (number>=100 &&number<1000){
                    treeDigitNumbers1++;
                }
            }
        }
        System.out.println("Trzycyfrowych liczb w tablicy numbers2D jest: " + treeDigitNumbers1);
    }
}
