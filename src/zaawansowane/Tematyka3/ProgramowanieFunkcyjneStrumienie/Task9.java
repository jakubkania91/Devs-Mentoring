package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie;

import zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task7.Main;

import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("John", 30);
        students.put("Ann", 20);
        students.put("Casper", 10);
        students.put("Jamie", 20);
        students.put("Kuba", 50);

        long count = students.entrySet().stream()
                .filter(student -> student.getValue() > 20 && student.getKey().length() > 3)
                .peek(student -> System.out.println(student.getKey()))
                .count();

        System.out.println("Liczba rekordow to: " + count);


    }
}
