package zaawansowane.tematyka1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        String data = "2019-03-11: 23.5, 19/03/12: 12.7, 2019.03.13: 11.1, 2019-marzec-14: 14.3";
        String regex = "\\d{4}[-./](?:0[1-9]|1[0-2])[-./](?:0[1-9]|[12][0-9]|3[01])";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        String dates = matcher.replaceAll("$0\n");
        System.out.println("Oddzielone daty");
        System.out.println(dates);

    }
}
