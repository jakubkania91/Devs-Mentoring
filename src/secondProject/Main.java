package secondProject;

public class Main {
    public static void main(String[] args) {

        FileManager fileManager = new FileManager();
        fileManager.listFilesInDirectory("/Users/PC");
        System.out.println("=========================\n");
        fileManager.sortFilesInDirectory("/Users/PC");
    }
}
