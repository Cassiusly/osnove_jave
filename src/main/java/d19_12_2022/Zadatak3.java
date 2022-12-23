package d19_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje speak loud programa.
//        Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako
//        da zadovolji uslov:
//        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//        ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima).
//        Svaka uneta rec sa ! utice na agresivnost.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite tekst: Cao!
//                Cao!
//                Unesite tekst: Hello
//        Hello!
//                Unesite tekst: Hi!
//                Hi!
//                Unesite tekst: Cuti
//        Cuti!
//                Unesite tekst: Ajde!
//                Ajde!
//                Nivo agresivnosti 60.
//        (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        double brojUzvicnika = 0;
        double procenat = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Unesite tekst: ");
            String tekst = s.next();
            if (tekst.contains("!")) {
                brojUzvicnika++;
                procenat = brojUzvicnika / n * 100;
                System.out.println(tekst);
            } else{
                System.out.println(tekst + "!");
            }
        }
        System.out.println("Nivo agresivnosti " + procenat + "%");
    }
}