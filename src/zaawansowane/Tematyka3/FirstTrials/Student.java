package zaawansowane.Tematyka3.FirstTrials;


public class Student {
    private final String name;
    private final String surname;
    private final int seniorityInYears;
    private final Language language;

    public Student(String name, String surname, int seniorityInYears, zaawansowane.Tematyka3.FirstTrials.Language language) {
        this.name = name;
        this.surname = surname;
        this.seniorityInYears = seniorityInYears;
        this.language = language;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getSeniorityInYears(){
        return seniorityInYears;
    }
    public zaawansowane.Tematyka3.FirstTrials.Language language(){
        return language;
    }

}
