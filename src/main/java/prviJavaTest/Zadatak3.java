package prviJavaTest;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve
// a drugi za neparne brojeve. Program sa tastature ucitava N brojeva koje
// unosi korisnik i parne brojeve dodaje u niz parnih brojeva a neparne brojeve
// u niz neparnih. Na kraju programa odstampati brojeve oba niza kao i sumu svakog niza.
//Napomena: Nizovi se stampaju koristeci petlje.
//Primer izvrsenja:
//Unesite N: 9
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 4
//Unesite broj: 8
//Unesite broj: 3
//Unesite broj: 9
//Unesite broj: 13
//Unesite broj: 10
//Unesite broj: 4
//Niz parnih: 2, 4, 8, 10, 4
//Suma parnih: 28
//Niz neparnih: 1, 3, 9, 13
//Suma neparnih: 26
public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList <Integer> parni = new ArrayList<>();
        ArrayList <Integer> neparni = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                parni.add(broj);
            } else {
                neparni.add(broj);
            }
        }
        //stampanje
        int zbirParnih = 0;
        int zbirNeparnih = 0;
        System.out.print("Niz parnih: ");
        for (int i = 0; i < parni.size(); i++) {
            System.out.print(parni.get(i) + ", ");
            zbirParnih = zbirParnih + parni.get(i);
        }

        System.out.println();
        System.out.println("Suma parnih: " + zbirParnih);

        System.out.print("Niz neparnih: ");
        for (int i = 0; i < neparni.size(); i++) {
            System.out.print(neparni.get(i) + ", ");
            zbirNeparnih = zbirNeparnih + neparni.get(i);
        }

        System.out.println();
        System.out.println("Suma neparnih: " + zbirNeparnih);
    }
}
