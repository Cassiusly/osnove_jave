package p26_12_2022;

import java.util.Scanner;

//4. Napisati funkciju koja stampa zbir, razliku, proizvod i
// kolicnik za dva prosledjena broja.
// Brojevi su ulazni parametri funkcije.
// U gravnom programu pozvati nekoliko puta funkciju
// sa razlicitim prosledjenim vrednostima.
public class Zadatak4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
       racunanje(10,2);
    }
    public static void racunanje (int a, int b) {
        System.out.println("Zbir je " + (a + b));
        System.out.println("Razlika je " + (a-b));
        System.out.println("Proizvod je " + a * b);
        System.out.println("Kolicnik je " + a / b);
    }
}
