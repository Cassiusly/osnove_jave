package p20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati program koji radi bipovanje ruznih reci.
//        Program radi za jednu recenicu, sto znaci da ucitava od
//        korisnika rec po rec sve dok se ne unese rec sa tackom.
//        Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//        Ruzne reci koje program prepoznaje su:
//        zajebava
//        mars
//        stoko
//        svinjo
//        Unesite rec: Jel
//                Jel
//        Unesite rec:ti
//                ti
//        Unesite rec:to
//                to
//        Unesite rec:mene
//                mene
//        Unesite rec:zajebavas
//                beeeeeeeeeep
//        Unesite rec:stoko
//                beeeeeeeeeep
//        Unesite rec:jedna.
//                jedna.
//                Kraj programa.

        Scanner s = new Scanner(System.in);

        String rec = "";
        String zajebavas = "zajebavas";
        String mars = "mars";
        String stoko = "stoko";
        String svinjo = "svinjo";
        boolean tacka = false;

        while (tacka == false) {
            System.out.print("Unesite rec: ");
            rec = s.next();

            if (rec.contains(zajebavas) || rec.contains(mars) || rec.contains(stoko) || rec.contains(svinjo)) {
                System.out.println("beeeeeeeeeep");
            } else {
                System.out.println(rec);
            } if (rec.endsWith(".")) {
                tacka = true;
                System.out.println("Kraj programa.");
            }
        }
    }
}