package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        int[] numbers = {1,10,15,20,30,40,50};

        List<Integer> squaredNumber = new ArrayList<>();
        for (int number:numbers) {
            int squared = number * number;
            squaredNumber.add(squared);

        }

        System.out.println("" +
                "Squared Numbers");
        for (int squar:squaredNumber) {
            System.out.println(squar);

        }
        }

            }



