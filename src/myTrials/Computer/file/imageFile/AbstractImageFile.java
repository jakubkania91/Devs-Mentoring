package myTrials.Computer.file.imageFile;

import myTrials.Computer.file.AbstractFile;
import myTrials.Computer.file.Type;
import myTrials.Computer.file.musicFile.MusicFile;

public abstract class AbstractImageFile extends AbstractFile {


    @Override
    public Type getType() {
        return Type.IMAGE;
    }

    public AbstractImageFile(String name, int size) {
        super(name, size);

    }
}
