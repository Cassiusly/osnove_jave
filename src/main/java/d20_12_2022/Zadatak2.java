package d20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji ucitava RIMSKE brojeva od korisnika i
//        na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

        Scanner s = new Scanner(System.in);
        String rimskiBroj = "";
        String kraj = "KRAJ";

        while (!rimskiBroj.equals(kraj)) {
            System.out.print("Unesite rimski broj: ");
            rimskiBroj = s.next();
            if (rimskiBroj.equals("I")) {
                System.out.println("Arapski: " + 1);
            } else if (rimskiBroj.equals("V")) {
                System.out.println("Arapski: " + 5);
            } else if (rimskiBroj.equals("X")) {
                System.out.println("Arapski: " + 10);
            } else if (rimskiBroj.equals("L")) {
                System.out.println("Arapski: " + 50);
            } else if (rimskiBroj.equals("C")) {
                System.out.println("Arapski: " + 100);
            } else if (rimskiBroj.equals("D")) {
                System.out.println("Arapski: " + 500);
            } else if (rimskiBroj.equals("M")) {
                System.out.println("Arapski: " + 1000);
            }
        }
        System.out.println("Kraj programa.");
    }
}