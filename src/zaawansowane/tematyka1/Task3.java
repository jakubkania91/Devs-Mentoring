package zaawansowane.tematyka1;

public class Task3 {
    public static void main(String[] args) {

        String reGex = "^[a-z]+(_[a-z]+)*$";
        String input = "aac_fdas";
        String input1 = "das.dsa";

        boolean matches = input.matches(reGex);
        boolean matches1 = input1.matches(reGex);
        System.out.println(matches);
        System.out.println(matches1);
    }
}
