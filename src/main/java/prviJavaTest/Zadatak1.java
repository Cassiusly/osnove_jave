package prviJavaTest;

import java.util.Scanner;

//Napisati program koji za dve unete osobe ispisuje koja je starija.
// Za svaku osobu se od  podataka unosi ime, godina, mesec i dan rodjenja.
// Na kraju programa ispisati koja je osoba starija.
//Primer izvrsenja 1:
//Unesite ime prve osobe: Pera
//Unesite godinu rodjenja prve osobe: 1998
//Unesite mesec rodjenja prve osobe: 10
//Unesite dan rodjenja prve osobe: 21
//Unesite ime druge osobe: Mika
//Unesite godinu rodjenja druge osobe: 1999
//Unesite mesec rodjenja druge osobe: 12
//Unesite dan rodjenja druge osobe: 15
//Pera je stariji.
//Primer izvrsenja 4:
//Unesite ime prve osobe: Pera
//Unesite godinu rodjenja prve osobe: 1998
//Unesite mesec rodjenja prve osobe: 10
//Unesite dan rodjenja prve osobe: 21
//Unesite ime druge osobe: Mika
//Unesite godinu rodjenja druge osobe: 1998
//Unesite mesec rodjenja druge osobe: 10
//Unesite dan rodjenja druge osobe: 21
//Iste su starosti.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ime prve osobe: ");
        String ime = s.next();
        System.out.print("Unesite godinu rodjenja prve osobe: ");
        int godinaRodjenja = s.nextInt();
        System.out.print("Unesite mesec rodjenja prve osobe: ");
        int mesecRodjenja = s.nextInt();
        System.out.print("Unesite dan rodjenja prve osobe: ");
        int danRodjenja = s.nextInt();
        System.out.print("Unesite ime druge osobe: ");
        String ime2 = s.next();
        System.out.print("Unesite godinu rodjenja druge osobe: ");
        int godinaRodjenja2 = s.nextInt();
        System.out.print("Unesite mesec rodjenja druge osobe: ");
        int mesecRodjenja2 = s.nextInt();
        System.out.print("Unesite dan rodjenja druge osobe: ");
        int danRodjenja2 = s.nextInt();
        if (godinaRodjenja > godinaRodjenja2 ||
                mesecRodjenja > mesecRodjenja2 ||
                danRodjenja > danRodjenja2) {
            System.out.println(ime + " je stariji.");
        } else if (godinaRodjenja2 > godinaRodjenja ||
        mesecRodjenja2 > mesecRodjenja ||
        danRodjenja2 > danRodjenja){
            System.out.println( ime2 + " je stariji.");
        } else if (godinaRodjenja == godinaRodjenja2 ||
                mesecRodjenja == mesecRodjenja2
                || danRodjenja == danRodjenja2) {
            System.out.println("Iste su starosti.");
        }
    }
}
