package zaawansowane.tematyka1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        String reGex = "\\b\\w*[s]{2,}\\b";
        String input = "Hiss hissss his";

        Pattern pattern = Pattern.compile(reGex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
    }
