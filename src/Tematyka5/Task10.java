package Tematyka5;

public class Task10 {
    public static void main(String[] args) {
        int[][] array = new int[10][3];

        for (int i = 0; i < 10; i++) {
            array[0][0] = i;
            array[0][1] = i * i;
            array[0][2] = i * i * i;

            System.out.println(array[0][0] + "\t" + array[0][1] + "\t" + array[0][2]);
        }
    }
}
