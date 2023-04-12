package myTrials.Computer.file.imageFile;

public class JPGImageFiles extends AbstractImageFile {
    int compression;

    public JPGImageFiles(String name, int size, int compression) {
       super(name, size);

       this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }

}
