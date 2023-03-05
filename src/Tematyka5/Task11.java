package Tematyka5;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        String[][] numbers2D = {{"John", "Jasper"}, {"Casper", "Jonathan"}, {"Unknown", "Unknown"}, {"Alice", "Bob"}, {"Stanley", "Unknown"}};

        for (String[] element:numbers2D) {
            boolean isUnKnow = false;
            for (String word:element) {
                if (word.contains("Unknow")){
                    isUnKnow = true;
                    break;
                }
            }
            if (!isUnKnow)
                System.out.println(Arrays.toString(element));


        }
    }
}
