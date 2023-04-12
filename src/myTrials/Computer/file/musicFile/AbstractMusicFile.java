package myTrials.Computer.file.musicFile;

import myTrials.Computer.file.AbstractFile;
import myTrials.Computer.file.Type;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    String bandName;
    String title;

    public AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name,size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public Type getType() {
        return Type.MUSIC;
    }
}
