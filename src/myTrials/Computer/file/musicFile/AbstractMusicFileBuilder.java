package myTrials.Computer.file.musicFile;

public class AbstractMusicFileBuilder {
    private String bandName;
    private String title;

    public AbstractMusicFileBuilder setBandName(String bandName) {
        this.bandName = bandName;
        return this;
    }

    public AbstractMusicFileBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public AbstractMusicFile createAbstractMusicFile() {
        return new AbstractMusicFile(bandName, title);
    }
}