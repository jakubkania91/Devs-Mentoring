package tematyka9.spotkanie;

public class LinuksOs extends OperationSystem{
    public LinuksOs(int ram) {
        super(ram);
    }

    @Override
    void specyficMethod() {
        System.out.println("LinuxOs Specyfication");
    }
}
