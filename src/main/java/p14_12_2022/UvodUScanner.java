package p14_12_2022;

import java.util.Scanner;

public class UvodUScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();
        int c = a + b;

        System.out.println("Suma " + a + "+" + b + "=" + c);

        System.out.println("Unesite ime: ");
        String ime = s.next(); // za jednu rec
        System.out.println("Uneto ime: " + ime);

        System.out.println("Daj unesi boolean: ");
        boolean unetBoolean = s.nextBoolean();
        System.out.println("b: " + unetBoolean);

    }
}
