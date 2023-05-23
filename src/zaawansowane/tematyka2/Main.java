package zaawansowane.tematyka2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = new ArrayList<>();
        namesList.add("Piotr");
        namesList.add("lukasz");
        try {
            System.out.println("Podaj index do wpisania");
            int index = scanner.nextInt();
            String name = namesList.get(index);
            System.out.println(name);
        } catch (InputMismatchException exception) {
            System.out.println("Wpisales cos co nie bylo liczba");
            System.out.println(exception.getMessage());
        }catch (IndexOutOfBoundsException exception){
            System.out.println("Wykroczyles poza index");
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("finally i tak sie wykonuje");
        }


    }
}
