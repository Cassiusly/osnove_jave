package p26_12_2022;
// (Za vezbanje)
//Napisati main program koji koristi metodu definisanu u 6.zad tako da stampa sledecu sliku za M. M unosi korisnik.
//
//
//Primer izvrsenja:
//Unesite M: 6
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite m " );
        int m = s.nextInt();
        for (int i = 0; i <= m; i++) {
           zvezdica(i);
            System.out.println();
        }
    }
    public static void zvezdica (int n){
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
