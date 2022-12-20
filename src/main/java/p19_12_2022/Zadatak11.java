package p19_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
//        Napisati program koji uneti password sakriva.
//        Primer izvrsenja:
//        Unestite password: OvoJePassword123
//        Skriverni password: ****************

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite password: ");
        String pass = s.next();
        int n = pass.length();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }


    }
}
