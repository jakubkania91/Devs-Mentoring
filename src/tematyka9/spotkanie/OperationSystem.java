package tematyka9.spotkanie;

public abstract class OperationSystem {

    protected int ram;

    public OperationSystem(int ram) {
        this.ram = ram;
    }

    void start() {
        System.out.println("Start OS");
    }

    void shotdown() {
        System.out.println("Turn off OS");
    }

    abstract void specyficMethod();

}


