package Trials;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class dateFormat {
    public static void main(String[] args) {

        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));

    }
}
