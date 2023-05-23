package zaawansowane.tematyka1;

public class Task1 {
    public static void main(String[] args) {

        String reGex = "^[a-z A-Z 0-9]+$";

        String input = "abc123";
        String input1 = "a!c123";

        boolean matches = input.matches(reGex);
        boolean matches1 = input1.matches(reGex);
        System.out.println(matches);
        System.out.println(matches1);

    }
}
