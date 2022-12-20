package p19_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        (ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva
//        i od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int broj = 0;
        int rezultat = 0;


        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            rezultat = rezultat * 10 + broj;

        }
        System.out.println("Rezultujuci broj je " + rezultat);
    }
}
