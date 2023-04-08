package Tematyka5;

import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> musicAlbums = new HashMap<>();

        musicAlbums.put("The Sensual World", "Kate Bush");
        musicAlbums.put("Shaday", "Ofra Haza");
        musicAlbums.put("Achtung Baby", "U2");
        musicAlbums.put("Aion", "Dead Can Dance");
        musicAlbums.put("Invisible Touch", "Genesis");

        Set<String> nameOfTheAlbum = musicAlbums.keySet();
        System.out.println(nameOfTheAlbum);
        System.out.println("Podaj nazwe albumu");
        String nameOfThealbums = scanner.nextLine();

        boolean albums = musicAlbums.containsKey(nameOfThealbums);
     /*   if (musicAlbums.containsKey(nameOfThealbums)){
            System.out.println("Tu będzie zmienione na poprawne ");
        } else if (musicAlbums.containsKey(musicAlbums.containsKey()){
            System.out.println("nie");
      */

         if (albums){
             System.out.println("Wykonawca albumu: " + nameOfThealbums + " jest " + musicAlbums.get(nameOfThealbums));
        }else if (!albums) {
             System.out.println("Brak danych");
         }
    }
}
