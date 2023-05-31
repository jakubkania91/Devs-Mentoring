package zaawansowane.Tematyka3.SecondTrials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("Krzysztof", "Cumbercooch", 25, Language.valueOf("Java"));
        Employee employee2 = new Employee("Piotr", "Kowalski", 29, Language.valueOf("Python"));
        Employee employee3 = new Employee("Kamil", "Cumber", 32, Language.valueOf("JavaScript"));
        Employee employee4 = new Employee("Kuba", "Tomato", 45, Language.valueOf("PHP"));
        Employee employee5 = new Employee("Sylwia", "Rcooch", 15, Language.valueOf("Java"));
        Employee employee6 = new Employee("Monika", "Mach", 75, Language.valueOf("Java"));
        Employee employee7 = new Employee("Lukasz", "Berco", 55, Language.valueOf("JavaScript"));
        Employee employee8 = new Employee("Kasia", "Kic", 21, Language.valueOf("Java"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);


        employees.stream()
                .forEach(System.out::println);

        System.out.println("=======================\n");

        employees.stream()
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .forEach(System.out::println);
        System.out.println("======================\n");

        employees.stream()
                .map(employee -> employee.getLastName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("======================\n");

        employees.stream()
                .map(employee -> "Wiek: " + employee.getAge() + ", Jezyk: " + employee.getLanguage())
                .forEach(System.out::println);

        List<Language> allLanguage = employees.stream()
                .map(Employee::getLanguage)
                .collect(Collectors.toList());

        System.out.println("======================\n");

        System.out.println(allLanguage);

        System.out.println("======================\n");

        List<Object> allLanguage2 = employees.stream()
                .map(Employee::getLanguage)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(allLanguage2);

        System.out.println("======================\n");

        employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("K"))
                .forEach(System.out::println);

        System.out.println("======================\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);

        System.out.println("======================\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .forEach(System.out::println);

        System.out.println("======================\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .limit(3)
                .forEach(System.out::println);

        System.out.println("======================\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .skip(3)
                .forEach(System.out::println);

        System.out.println("======================\n");

        long numberEmployees = employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("K"))
                .count();
        System.out.println(numberEmployees);

        System.out.println("======================\n");

        Employee youngestEmployee = employees.stream()
                .min(Comparator.comparing(Employee::getAge)).get();
        System.out.println(youngestEmployee);

        System.out.println("======================\n");

        Employee oldestEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(oldestEmployee);

        System.out.println("======================\n");

        Employee employee = employees.stream()
                .filter(emp -> emp.getFirstName().startsWith("K"))
                .findFirst().get();
        System.out.println(employee);

        System.out.println("======================\n");

        Employee employeeFindAny = employees.stream()
                .filter(emp -> emp.getFirstName().startsWith("K"))
                .findAny().get();
        System.out.println(employeeFindAny);

        System.out.println("======================\n");

        boolean b = employees.stream()
                .allMatch(emp -> emp.getFirstName().contains("K"));
        System.out.println(b);

        System.out.println("======================\n");

        boolean k = employees.stream()
                .anyMatch(emp -> emp.getFirstName().contains("K"));
        System.out.println(k);

        System.out.println("======================\n");

        boolean z = employees.stream()
                .noneMatch(emp -> emp.getFirstName().startsWith("Z"));
        System.out.println(z);

        System.out.println("======================\n");

        Integer sumOfAllAges = employees.stream()
                .map(Employee::getAge)
                .reduce(Integer::sum)
                .get();
        System.out.println(sumOfAllAges);

        System.out.println("======================\n");

        Integer i = employees.stream()
                .map(Employee::getAge)
                .reduce(0, Integer::sum);
        System.out.println(i);

        System.out.println("======================\n");

        Integer sumOfAllAges1 = employees.stream()
                .reduce(0, (age, emp) -> age + emp.getAge(), Integer::sum);
        System.out.println(sumOfAllAges1);

        System.out.println("======================\n");

        String allNames = employees.stream()
                .map(Employee::getFirstName)
                .reduce((name, name2) -> name + ", " + name2)
                .get();
        System.out.println(allNames);

        System.out.println("======================\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .takeWhile(emp -> emp.getAge() < 30)
                .forEach(System.out::println);

        System.out.println("======================\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .dropWhile(emp -> emp.getAge() < 30)
                .forEach(System.out::println);

        System.out.println("======================\n");

        String sentence = "Ucze sie programowania";

        sentence.chars().forEach(s-> System.out.print((char) s));
        System.out.println();
        sentence.chars().parallel().forEach(s-> System.out.print((char) s));
        System.out.println();
        sentence.chars().parallel().forEachOrdered(s-> System.out.print((char) s));

        System.out.println("======================\n");






    }
}
