package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot",
                "API", "Microservices", "AWS", "microservices", "Doceker", "Kubernetes");

        System.out.println("Elementy zawierajace slowo Spring");
        courses.stream()
                .filter(cours -> cours.contains("Spring"))
                .forEach(System.out::println);

        System.out.println("\nElementy majace minimum 4 litery");
        courses.stream()
                .filter(cours -> cours.length()>= 4)
                .forEach(System.out::println);
    }
}
