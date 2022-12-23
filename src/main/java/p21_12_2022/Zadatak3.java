package p21_12_2022;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog
//        (na poziciji nula) i zadnjeg elemnta niza.


        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(13);
        brojevi.add(19);
        brojevi.add(15);
        brojevi.add(20);
        brojevi.add(39);

        int poslednjiIndex =  brojevi.size()-1;
       int prvi = brojevi.get(0);
       int poslednji = brojevi.get(poslednjiIndex);

        brojevi.set(0, poslednji);
       brojevi.set(poslednji, prvi);


        System.out.println(brojevi);

    }
}
