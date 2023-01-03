package miniProjekat;

import java.util.Scanner;

public class XOigra {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    XOTabla igra = new XOTabla();

        //Unosenje imena
        System.out.print("Unesite ime X igraca: ");
        igra.setImeX(s.next());
        System.out.print("Unesite ime O igraca: ");
        igra.setImeO(s.next());

        //Pokretanje igre
        igra.pokreniIGru();

        //Petlja dok se ne popune sva polja ili jedan od igraca ne pobedi
        while (!igra.popunjenaTabla() && !igra.pobednikX() && !igra.pobednikO()) {

            //Stampanje polja
            igra.stampaj();
            System.out.print("Unesite polje koje zelite da odigrate 1-9: ");
            int polje = s.nextInt();

            //Druga petlja da mogu da se koriste samo ponudjena polja(prazna)
            while (!igra.poljePrazno(polje)) {
                if (polje>9 || polje<1) {
                    System.out.print("Takvo polje ne postoji, izaberite drugo: ");
                } else {
                    System.out.print("Izabrano polje je popunjeno, izaberite drugo: ");
                }
                polje = s.nextInt();
            }

            //Unosimo vrednosti X ili O i prebacujemo u velika slova ako se unesu mala
            System.out.print("Unesite X ili O: ");
            String xO = s.next().toUpperCase();

            //Treca petlja za ogranicenje da moze samo X i O da se unese
            while (!xO.equals("X") && !xO.equals("O")) {
                System.out.print("Uneli ste pogresan znak, pokusajte ponovo.");
                xO = s.next().toUpperCase();
            }
            //Cetvrta petlja za ogranicenje da moze samo igrac koji je na redu da igra
            while (!igra.getNaPotezu().equals(xO)) {
                System.out.println("Na redu je igrac: " + igra.getNaPotezu());
                System.out.println("Unesite znak: ");
                xO = s.next().toUpperCase();
            }
            //Iz klase XOTabla prenosimo unesenu vrednost u promenljivu
            igra.setUnosXO(xO);
            //Unosimo vrednost u polje
            igra.odigrajPotez(polje);

            //Zavrsni uslovi za pobednika i izlaz iz while petlje
            if (igra.pobednikX()) {
                System.out.println();
                System.out.println("Pobednik je: " + igra.getNaPotezu() + ": "+ igra.getImeX());
                igra.stampaj();
            } else if (igra.pobednikO()) {
                System.out.println();
                System.out.println("Pobednik je: " + igra.getNaPotezu() + ": "+ igra.getImeO());
                igra.stampaj();
            } else if (igra.popunjenaTabla()) {
                System.out.println();
                System.out.println("Igra je neresena.");
                igra.stampaj();
            }
            igra.zameniIgraca();
        }
    }
}