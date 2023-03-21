package Tematyka5;

public class MyTrials {
    public static void main(String[] args) {
        int[][] arr = new int[4][];

        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];
        arr[3] = new int[1];

        for (int[] subarr : arr) {
            for (int element : subarr) {
                System.out.println(element + " ");
            }
            System.out.println();
        }
    }
}
