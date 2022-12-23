package d19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//                smile
//        heart
//
//        Primer izvrsenja:
//        Unesite N: 7
//        Reaguj: like
//        Reaguj: heart
//        Reaguj: smile
//        Reaguj: lol
//        Reaguj: smile
//        Reaguj: like
//        Reaguj: like
//        Summary: like 3 | smile 2 | heart 1
//
//        Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//        POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva
//        promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart
//        cuva promenljiva heartCounter

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int likeCounter = 0;
        int smileCounter = 0;
        int heartCounter = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Reaguj: ");
            String reakcija = s.next();

            if (reakcija.contains("like")){
                likeCounter++;
            }
            if (reakcija.contains("smile")){
                smileCounter++;
            }
            if (reakcija.contains("heart")) {
                heartCounter++;
            }
        }
        System.out.println("Summary: " + "like " + likeCounter + " | "
                + "smile " + smileCounter + " | " + "heart " + heartCounter);
    }
}
