package p13_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati program koji racuna prosecnu vrednost za tri decimalna broja a, b i c.
//        Vrednosti za a, b i c su proizvoljne.
//        Primer izvrsenja:
//        a: 10.0
//        b: 5.0
//        c: 6.0
//        Srednja vrednost je 7.0

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        double a = s.nextDouble();
        System.out.print("Unesite b: ");
        double b = s.nextDouble();
        System.out.print("Unesite c: ");
        double c = s.nextDouble();


        double d = (a + b + c) / 3;
        System.out.println("Srednja vrednost je: " + d);


    }
}
