package zaawansowane.Tematyka3.SecondTrials;

import java.util.List;

public class Employee {
   private String firstName;
   private String lastName;
    int age;

    private Language language;

    public Language getLanguage() {
        return language;
    }

    private List<String> skills;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Employee(String firstName, String lastName, int age, Language language){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.language = language;
   }

    @Override
    public String toString() {
        return "Imie: %s, Nazwisko: %s, Wiek: %s, Jezyk: %s".formatted(firstName, lastName, age, language);
    }
}

