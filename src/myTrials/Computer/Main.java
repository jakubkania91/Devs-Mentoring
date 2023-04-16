package myTrials.Computer;

import myTrials.Computer.USBDevice.MemoryStick;
import myTrials.Computer.USBDevice.Mouse;
import myTrials.Computer.drive.Drive;
import myTrials.Computer.drive.HDDDrive;
import myTrials.Computer.drive.SSDDrive;
import myTrials.Computer.file.File;
import myTrials.Computer.file.imageFile.GIFImageFile;
import myTrials.Computer.file.imageFile.JPGImageFiles;
import myTrials.Computer.file.musicFile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gift1 = new GIFImageFile("gift1.gif", 150);
        JPGImageFiles jpg1 = new JPGImageFiles("jpeeg1.jpg", 300, 200);

        MP3MusicFile mp3 = new MP3MusicFile( "mp3", 300, "Sanah", "Mamo tyś płakała", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gift1);
        drive.addFile(jpg1);
        drive.addFile(mp3);

        drive.listFiles();
        File file = drive.findFile("mp3");
        System.out.println(file.getSize());
    }
}