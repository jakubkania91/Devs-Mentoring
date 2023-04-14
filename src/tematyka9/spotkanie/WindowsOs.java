package tematyka9.spotkanie;

public class WindowsOs extends OperationSystem{

    public WindowsOs(int ram) {
        super(ram);
    }

    @Override
    void start() {
        System.out.println("Starting WindowsOs");

    }

    @Override
    void specyficMethod() {
        System.out.println("WindowsOs Specyfication");
    }
}
