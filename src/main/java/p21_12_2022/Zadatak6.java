package p21_12_2022;

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati progam koji stampa niz u obrnutom redosledu tj.
//        od zadnjeg elementa do nultog.
//        Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(7);

        for (int i = brojevi.size()-1; i >= 0; i--) {
            System.out.print(brojevi.get(i) + ", ");
        }

    }
}
