package p27_12_2022;

//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima
//		i ostampati podatke za svaki objekat.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Racun anita = new Racun();

        anita.brojRacuna="756-8970-009";
        anita.imePrezimeVlasnika="Anita Nestorovic";
        anita.stanjeNaRacunu=100000.00;

        System.out.println("Posaljilac: " + anita.imePrezimeVlasnika + ", "
                + anita.brojRacuna + ", " + anita.stanjeNaRacunu + ".");

        Racun dobrivoje = new Racun();

        dobrivoje.brojRacuna="284-7471729-148";
        dobrivoje.imePrezimeVlasnika= "Dobrivoje Vulic";
        dobrivoje.stanjeNaRacunu= 567894.00;

        System.out.println("Primalac: " + dobrivoje.imePrezimeVlasnika +
                ", " +dobrivoje.brojRacuna + ", " +  + dobrivoje.stanjeNaRacunu + ".");

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite sumu za transakciju: ");
        double suma = s.nextDouble();

        System.out.println("Stanje nakon transakcije");

        anita.stanjeNaRacunu = anita.stanjeNaRacunu - suma;
        dobrivoje.stanjeNaRacunu = dobrivoje.stanjeNaRacunu + suma;

        System.out.println("Posaljilac: " + anita.imePrezimeVlasnika + ", "
                + anita.brojRacuna + ", " + anita.stanjeNaRacunu + ".");
        System.out.println("Primalac: " + dobrivoje.imePrezimeVlasnika +
                ", " +dobrivoje.brojRacuna + ", " +   dobrivoje.stanjeNaRacunu + ".");
    }
}