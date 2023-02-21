package tematyka4.homework;

public class TestValueArray {
    public static void main(String[] args) {

        System.out.println("Char Array");
        System.out.println("");
        char[] value = new char[4];
        value[0] = (char) 10;
        value[1] = 'a';

        System.out.println("Pierwszy element tablicy ma wartosc: " + value[0]);
        System.out.println("Trzeci element tablicy ma wartosc: " + value[2]);
        System.out.println("Czwarty element tablicy ma wartosc: " + value[3]);

        System.out.println("=============");
        System.out.println("String Array");
        System.out.println("");

        String[] bike = new String[4];
        bike[0] = String.valueOf(11);


        System.out.println("Pierwszy element tablicy ma wartosc: " + bike[0]);
        System.out.println("Trzeci element tablicy ma wartosc: " + bike[2]);
        System.out.println("Czwarty element tablicy ma wartosc: " + bike[3]);

        System.out.println("===========");
        System.out.println("Bool Array");
        System.out.println("");


        boolean[] tab = new boolean[4];
        tab[0] = true;

        System.out.println("Pierwszy element tablicy ma wartosc: " + tab[0]);
        System.out.println("Trzeci element tablicy ma wartosc: " + tab[2]);
        System.out.println("Czwarty element tablicy ma wartosc: " + tab[3]);



    }
}


