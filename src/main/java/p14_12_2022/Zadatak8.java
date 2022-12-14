package p14_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

//        Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//        znak karte koja je na stolu
//        broj karte koja je na stolu
//        znak karte koju igrac zeli da odigra
//        broj karte koju igrac zeli da odigra
//        i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko
//        se karta na stolu i odigrana karta poklapaju po znaku ili broju.
//
//        Znakovi karata: srce, kocka, list, detelina
//        Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K
//
//        Primer izvrsenja 1:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A
//        Znak karte koju zelis da odigras: detelina
//        Broja karte koju zelis da odigras: A
//        Potez je validan.
//
//        Primer izvrsenja 2:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A

        Scanner s = new Scanner(System.in);

        System.out.println("Znak karte na stolu: ");
        String znakSto = s.next();
        System.out.println("Broj karte na stolu: ");
        String brojSto = s.next();
        System.out.println("Znak karte koju zelis da odigras: ");
        String znakRuka = s.next();
        System.out.println("Broj karte koju zelis da odigras: ");
        String brojRuka = s.next();

        if (znakSto.equals(znakRuka) || brojSto.equals(brojRuka)) {
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez nije validan.");
        }



    }
}
