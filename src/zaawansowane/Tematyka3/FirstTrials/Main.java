package zaawansowane.Tematyka3.FirstTrials;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Jan", "Maj", 0, zaawansowane.Tematyka3.FirstTrials.Language.PYTHON),
                new Student("Joanna", "Kowalska", 10, zaawansowane.Tematyka3.FirstTrials.Language.JS),
                new Student("Adam", "Kowalski", 6, zaawansowane.Tematyka3.FirstTrials.Language.JAVA),
                new Student("Grzegorz", "Lipka", 1, zaawansowane.Tematyka3.FirstTrials.Language.JAVA),
                new Student("Filip", "Kułak", 0, zaawansowane.Tematyka3.FirstTrials.Language.JS),
                new Student("Joanna", "Maciorek", 1, zaawansowane.Tematyka3.FirstTrials.Language.PYTHON),
                new Student("Marcin", "Tyszka", 0, zaawansowane.Tematyka3.FirstTrials.Language.JAVA),
                new Student("Will", "Smith", 1, Language.PYTHON)
        );
       // students.stream()
       //         .filter(student -> student.getSeniorityInYears() > 5)
       //         .filter(student -> student.language().equals(Language.JAVA))
        //        .map(student -> (student.getName() + " " + student.getSurname()).toUpperCase())
       //         .forEach(System.out::println);

        students.stream()
                .forEach(Student -> System.out.println(students));
    }
}
