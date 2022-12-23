package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i racuna i stampa sumu svih brojeva niza.
//        Primer: Ako je niz 1,2,4,5,7
//        Stampa se, suma = 19

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(13);
        brojevi.add(19);
        brojevi.add(15);
        brojevi.add(20);
        brojevi.add(39);

        int suma = 0;
        for (int i = 0; i < brojevi.size(); i++) {
            suma = suma + brojevi.get(i);
        }
        System.out.println("suma = " + suma);
    }
}
