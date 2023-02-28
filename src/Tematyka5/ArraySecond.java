package Tematyka5;

import java.util.Arrays;

public class ArraySecond {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 5, 7, 2, -1, -8, 2, 1, 5, 4};

        int desiredIndex = 3;
        int desiredValue = 9;

        System.out.println("array: " + Arrays.toString(myArray));

        for (int i = myArray.length - 1; i > desiredIndex; i--) {
            myArray[i] = myArray[i - 1];
        }
        System.out.println("array during calculation: " + Arrays.toString(myArray));
            myArray[desiredIndex] = desiredValue;
        System.out.println("array: " + Arrays.toString(myArray));
    }

}
