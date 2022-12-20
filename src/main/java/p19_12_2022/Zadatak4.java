package p19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji pronalazi K-ti stepen broja N. Koristeci FOR petlju
//        K i N unosi korisnik.
//                Primer izvrsenja:
//        Unesite K: 7
//        Unesite N: 2
//        Rezultat 128

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite K: ");
        int k = s.nextInt();
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int izlazniBroj = n;

        for (int i = 1; i < k; i++) {
            izlazniBroj *= n;
        }
        System.out.println("Rezultat " + izlazniBroj);
    }
}
