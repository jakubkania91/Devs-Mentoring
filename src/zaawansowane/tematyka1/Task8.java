package zaawansowane.tematyka1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {

        Pattern compile = Pattern.compile("\\b\\d+\\b");
        String sentence = "2 cats and 3 dogs";
        Matcher matcher = compile.matcher(sentence);

        while (matcher.find()) {
            String number = matcher.group();
            System.out.println(number);
        }


    }
}
