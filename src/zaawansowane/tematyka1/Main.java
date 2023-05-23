package zaawansowane.tematyka1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern hello_word = Pattern.compile("Hello Word",Pattern.CASE_INSENSITIVE);
        String helloWordText = "Hello Word";
        String helloWordTextButSmall = "hello word";
        boolean matches = hello_word.matcher(helloWordText).matches();
        boolean matches1 = hello_word.matcher(helloWordTextButSmall).matches();
        System.out.println(matches);
        System.out.println(matches1);

        Pattern compile = Pattern.compile("\\s");
        String loremIpsum = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been";
        String[] split = compile.split(loremIpsum);
        System.out.println(Arrays.toString(split));

        Pattern postCodeVeryFier = Pattern.compile("[0-9]{2}-[0-9]{3}");
        String codePost = "27-200";
        boolean code = postCodeVeryFier.matcher(codePost).matches();
        System.out.println(code);


    }
}
