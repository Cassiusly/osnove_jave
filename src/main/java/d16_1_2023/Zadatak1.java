package d16_1_2023;

import java.util.Scanner;

//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na
// kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
public class Zadatak1 {
    public static void main(String[] args) {
//        Igrac i1 = new Igrac("Anita Nestorovic", "11112223345", 1995, 10, "Napadac",true);
//        Igrac i2 = new Igrac("Ilija Nestorovic", "22233456789", 1998, 7, "Odbrana",false);
//        System.out.println("Prvi igrac: ");
//        i1.stampaj();
//        System.out.println("Drugi igrac: ");
//        i2.stampaj();
//        Trener t1 = new Trener("Marko Markovic", "11122346789", 1970, 15, "Kondicioni");
//        Trener t2 = new Trener("Nikola Nikolic", "99987552625", 1989, 10, "Za igru");
//        System.out.println("Prvi trener: ");
//        t1.stampaj();
//        System.out.println("Drugi trener: ");
//        t2.stampaj();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Igrac igrac = new Igrac();
            System.out.print("Unesite ime i prezime igraca: ");
            igrac.setImePrezime(s.next());
            System.out.print("Unesite JMBG: ");
            igrac.setJmbg(s.next());
            System.out.print("Unesite godinu rodjenja: ");
            igrac.setGodRodjenja(s.nextInt());
            System.out.print("Unesite broj dresa igraca: ");
            igrac.setBroj(s.nextInt());
            System.out.print("Unesite poziciju igraca: ");
            igrac.setPozicija(s.next());
            System.out.print("Unesite da li je igrac kapiten (jeste/nije): ");
            String kapiten = s.next().toLowerCase();
            if (kapiten.equals("jeste")) {
                igrac.setKapiten(true);
            } else if (kapiten.equals("nije")) {
                igrac.setKapiten(false);
            }
            while (!kapiten.equals("jeste") && !kapiten.equals("nije")) {
                System.out.print("Uneli ste pogresnu vrednost. Unesite ponovo: ");
                kapiten = s.next().toLowerCase();
            }

            Trener trener = new Trener();
            System.out.print("Unesite ime i prezime trenera: ");
            trener.setImePrezime(s.next());
            System.out.print("Unesite JMBG: ");
            trener.setJmbg(s.next());
            System.out.print("Unesite godinu rodjenja: ");
            trener.setGodRodjenja(s.nextInt());
            System.out.print("Unesite broj godina iskustva trenera: ");
            trener.setGodineIskustva(s.nextInt());
            System.out.print("Unesite tip trenera (kondicioni, pomocni, perosnalni): ");
            trener.setTip(s.next());

            igrac.stampaj();
            trener.stampaj();
        }
    }
}
