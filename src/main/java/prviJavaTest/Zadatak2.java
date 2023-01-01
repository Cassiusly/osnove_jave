package prviJavaTest;

import java.util.Scanner;

//Napisati program koji petljom iscrtava toplomer.
// Korisnik sa tastature unosi granice toplomera i
// iscrtava se slika kao u primeru
//Primer izvrsenja 1:
//Unesite donju granicu toplomera: 35
//Unesite gornju granicu toplomera: 42
//|-42  |
//|-41  |
//|-40  |
//|-39  |
//|-38  |
//|-37  |
//|-36  |
//|-35  |
//\      /
// |    |
public class Zadatak2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Unesite donju granicu toplomera: ");
        int donjaGranica = s.nextInt();
        System.out.print("Unesite gornju granicu toplomera: ");
        int gornjaGranica = s.nextInt();
        for (int i = gornjaGranica; i >= donjaGranica; i--) {
            System.out.println("|-" + i + "|");
        }
        System.out.println("\\ /");
        System.out.println("| |");
    }
}
