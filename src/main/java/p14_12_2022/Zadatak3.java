package p14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji sa tastature ucitava
//        tri broja a, b i c i ispisuje srednju vrednost
//        za ta tri broja. Sve promenljive u programu su po tipu double

        Scanner s = new Scanner(System.in);

        System.out.print("a = ");
        double a = s.nextInt();

        System.out.print("b = ");
        double b = s.nextDouble();

        System.out.print("c = ");
        double c = s.nextDouble();

        System.out.println("Srednja vrednost je = " + (a + b + c) / 3);



    }
}
