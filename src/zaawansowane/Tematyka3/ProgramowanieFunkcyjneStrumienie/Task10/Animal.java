package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task10;

import zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task7.Type;

abstract class Animal {
    private String name;
    private int noEyes;

    public Animal(String name, int noEyes) {
        this.name = name;
        this.noEyes = noEyes;
    }

    public String getName() {
        return name;
    }

    public int getNoEyes() {
        return noEyes;
    }
    public abstract String getType();
}