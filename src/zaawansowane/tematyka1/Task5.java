package zaawansowane.tematyka1;

import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {

        Pattern wordRegex = Pattern.compile("^" + "[a-z B-Z]{6,}$");
        String word = "Python should match";
        String word1 = "unique New York";
        String word2 = "Regular Expressions";
        String word3 = "ALOHA";

        boolean matches = wordRegex.matcher(word).matches();
        boolean matches1 = wordRegex.matcher(word1).matches();
        boolean matches2 = wordRegex.matcher(word2).matches();
        boolean matches3 = wordRegex.matcher(word3).matches();

        System.out.println(matches);
        System.out.println(matches1);
        System.out.println(matches2);
        System.out.println(matches3);
    }
}
