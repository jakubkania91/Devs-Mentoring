package tematyka4.homework;

public class WhileLoops {
    public static void main(String[] args) {
        /*
        while(expression){
            body
        }
         */
        int currentDay = 1;
        int counter = 0;
        while (currentDay <= 7) {
            System.out.println(currentDay);

            if (currentDay == 3) {
                System.out.println("We skip wednesday");
                currentDay++;
                continue;
            }

            currentDay++;
        }

    }
}
