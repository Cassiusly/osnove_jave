package VezbanjeSlack;

import java.util.Scanner;

public class ZadatakWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String lozinka = "";
        boolean validnaLozinka = false;

        while (!validnaLozinka) {
            System.out.println("Unesite lozinku: ");
            lozinka = s.next();
            if (lozinka.length() >= 8 && (lozinka.contains("@") || lozinka.contains("#"))) {
                validnaLozinka = true;
                System.out.println("Lozinka je validna");
            } else {
                System.out.println("Lozinka nije validna. ");
            }
        }
    }
}