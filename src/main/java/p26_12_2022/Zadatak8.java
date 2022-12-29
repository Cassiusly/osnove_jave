package p26_12_2022;

import java.util.Scanner;

//Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
// Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = s.nextInt();

        System.out.println(suprotnoNegativanBroj(n));
    }
    public static int suprotnoNegativanBroj (int n) {
        return n * (-1);
    }
}
