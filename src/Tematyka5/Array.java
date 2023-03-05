package Tematyka5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] myArray = new String[3];
        myArray[0] = "Zbyszek";
        myArray[1] = "Karol";
        myArray[2] = "Bartek";

        String[] myArray2 = new String[]{"Zbyszek", "Roman", "Karol"};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("array[" + i + "]: " + myArray[i]);

        }

        for (String element : myArray) {
            System.out.println("NextElement: " + element);

        }

        System.out.println(Arrays.toString(myArray2));

    }
}
