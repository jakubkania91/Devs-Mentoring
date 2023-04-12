package myTrials.Computer;

import myTrials.Computer.USBDevice.MemoryStick;
import myTrials.Computer.USBDevice.Mouse;
import myTrials.Computer.drive.HDDDrive;
import myTrials.Computer.drive.SSDDrive;

public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
 //       HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("pierwsze programowanie"));
 //       drive.listFiles();

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mouse");

        computer.addUSBDevice(memoryStick);
 //       computer.addUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
 //       computer.removeUSBDevice(mouse);

    }
}
