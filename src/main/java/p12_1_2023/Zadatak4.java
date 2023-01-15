package p12_1_2023;

import java.util.ArrayList;
import java.util.Scanner;

//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka
// ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e
public class Zadatak4 {
    public static void main(String[] args) {

        Sastojak sastojak1 = new Sastojak("brasno", 50);
        Sastojak sastojak2 = new Sastojak("mleko", 290);
        Sastojak sastojak3 = new Sastojak("med", 400);

        ArrayList <Sastojak> sastojci = new ArrayList<>();
        sastojci.add(sastojak1);
        sastojci.add(sastojak2);
        sastojci.add(sastojak3);

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj sastojaka: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime sastojka: ");
            String ime = s.next();
            System.out.println("Unesite cenu: ");
            int cena = s.nextInt();
            Sastojak x = new Sastojak(ime, cena);
            sastojci.add(x);
        }
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNazivSastojka() + " - " + sastojci.get(i).getCena());
        }

    }
}
