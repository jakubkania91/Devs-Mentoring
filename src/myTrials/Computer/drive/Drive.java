package myTrials.Computer.drive;

import myTrials.Computer.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
    }

