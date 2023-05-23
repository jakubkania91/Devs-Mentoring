package zaawansowane.tematyka1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        String color1 = "#ab4";
        String color2 = "#AB4B72";
        String color3 = "#ab43";

        String regex = "^#([a-fA-F0-9]{3}|[a-fA-F0-9]{3})?$";
        Pattern compile = Pattern.compile(regex);

        Matcher matcher = compile.matcher(color1);
        Matcher matcher1 = compile.matcher(color2);
        Matcher matcher2 = compile.matcher(color3);

        System.out.println(color1 + " " + matcher.matches());
        System.out.println(color2 + " " + matcher.matches());
        System.out.println(color3 + " " + matcher.matches());
    }
}
