package ConditionalStatementMyTrials;

import java.util.Scanner;

public class ad4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int day = scanner.nextInt();


        System.out.println(getDayName(day));
    }
    public static String getDayName(int day){
        String dayName = "";
        switch (day){
            case 1:dayName = "Monday";
            break;
            case 2:dayName= "Tuesday";
            break;
            case 3:dayName="Wednesday";
            break;
            case 4:dayName ="thursday";
            break;
            case 5:dayName = "Friday";
            break;
            case 6:dayName= "Saturday";
            break;
            case 7: dayName="Sunday";
            break;
            default:dayName ="Invalid day range";
        }
        return dayName;
    }
}
