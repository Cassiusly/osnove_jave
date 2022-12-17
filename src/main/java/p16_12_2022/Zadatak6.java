package p16_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        Napisati program koji simulira stampanje ocitane licne karte u vise primeraka.
//        Korisnik unosi podatke :
//        ime
//        prezime
//        jmbg
//        broj primeraka za stampu
//        Primer izvrsenja:
//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite jmbg: 2109238932232
//        Unesite broj primeraka za stampu: 3
//
//        Primerak 1
//        **********************************
//        Ime i prezime: Milan Jovanovic
//        JMBG: 2109238932232
//        **********************************

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite jmbg: ");
        String jmbg = s.next();
        System.out.print("Unesite broj primeraka za stampu: ");
        int primerak = s.nextInt();


        for (int i = 1; i < primerak; i++) {
            System.out.println("Primerak " + i);
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("**********************************");
            System.out.println();
        }


    }
}
