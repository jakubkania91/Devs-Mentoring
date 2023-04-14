package tematyka9.spotkanie;

public class Main {
    public static void main(String[] args) {

        OperationSystem linux = new LinuksOs(8);
        OperationSystem windows = new WindowsOs(16);
        linux.specyficMethod();
        linux.shotdown();
        linux.start();
        System.out.println("\n");
        windows.start();
        windows.shotdown();
        windows.specyficMethod();
    }
}
