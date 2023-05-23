package zaawansowane.tematyka1;

public class Task2 {
    public static void main(String[] args) {

        String reGex = "^(0|[b]).*";
        String input = "bbbaca123";
        String input1 = "cbbca123";

        boolean matches = input.matches(reGex);
        boolean matches1 = input1.matches(reGex);
        System.out.println(matches);
        System.out.println(matches1);
    }
}
