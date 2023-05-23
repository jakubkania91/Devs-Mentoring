package zaawansowane.tematyka1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String email = "j.kania@devsmentoring.pl";

        String companyName = extractCompanyName(email);
        System.out.println(companyName);
    }

    public static String extractCompanyName(String email) {
        Pattern nameCompany = Pattern.compile("@([^.]+)\\.");
        Matcher matcher = nameCompany.matcher(email);


        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
}

