package Tematyka5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> musicAlbums = new HashMap<>();

        musicAlbums.put("The Sensual World", "Kate Bush");
        musicAlbums.put("Shaday", "Ofra Haza");
        musicAlbums.put("Achtung Baby", "U2");
        musicAlbums.put("Aion", "Dead Can Dance");
        musicAlbums.put("Invisible Touch", "Genesis");

        while (true) {
            printMenu();
            int chose = scanner.nextInt();
            if (chose == 1) {
                System.out.println("Podaj nazwe albumu");
                String albumName = scanner.next();
                if (musicAlbums.containsKey(albumName)) {
                    System.out.println("taki album juz istnieje");
                } else {
                    System.out.println("Podaj wykonawce");
                    String artist = scanner.next();
                    musicAlbums.put(albumName, artist);
                    System.out.println("dodano pomyslnie album " + albumName + " wykonawcy " + artist);
                }
            }
            if (chose == 2) {
                System.out.println("podaj album do usuniecia");
                String removeAlbum = scanner.next();
                if (musicAlbums.containsKey(removeAlbum)) {
                    musicAlbums.remove(removeAlbum);
                    System.out.println("album usuniety pomyslnie");
                } else {
                    System.out.println("nie ma takie albumu");
                }
            }
            if (chose == 3) {
                System.out.println("Podaj album do sprawdzenia");
                String checkAlbum = scanner.next();
                if (musicAlbums.containsKey(checkAlbum)) {
                    System.out.println("Album " + checkAlbum + " Wykonawcy " + musicAlbums.get(checkAlbum));
                } else {
                    System.out.println("nie ma takiego albumu");
                }
            }
            if (chose == 4) {
                int iterator = 1;

                for (Map.Entry<String, String> it : musicAlbums.entrySet()) {
                    String album = it.getKey();
                    String artist = it.getValue();
                    System.out.println(iterator + ". Artysta " + artist + ", Album " + album);
                    iterator++;
                }
            }
            if (chose == 5) {
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println(" 1-dodaj album \n" +
                "2-usun album\n" +
                "3-sprawdz czy istnieje album\n" +
                "4-wyswietl wszytkie albumy\n" +
                "5-wyjdz");

    }
}
