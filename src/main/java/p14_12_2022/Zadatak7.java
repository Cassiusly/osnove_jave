package p14_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//        Zadatak
//        Napisati program koji ucitava stranice trougla a, b i c
//        i ispisuje da li je trougao pravougli.
//        Trougao je pravougli ako je (a*a) + (b*b) = c*c
//
//        Primer izvrsenja 1:
//        Unesite a: 3
//        Unesite b: 4
//        Unesite c: 5
//        Trougao je pravougli
//
//        Primer izvrsenja 2:
//        Unesite a: 3
//        Unesite b: 4
//        Unesite c: 6
//        Trougao nije pravougli

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite c: ");
        int c = s.nextInt();
        int d  = (a*a) + (b*b);
        int e = c*c;

        if (d==e){
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
        }
}
