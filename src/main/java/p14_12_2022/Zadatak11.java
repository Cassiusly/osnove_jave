package p14_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
//
//        Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 i deljiv sa 3.
//        Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
//
//        HINT: Broj B je deljiv brojem A ukoliko je ostatak pri deljenju sa A jedan nuli.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");

        int a = s.nextInt();


        if ((a % 2 == 0) && (a % 3 == 0)) {
            System.out.println("Broj a je deljiv.");
        } else if (a % 2 == 0) {
            System.out.println("Broj a je deljiv sa 2.");
        } else if (a % 3 == 0) {
            System.out.println("Broj a je deljiv sa 3.");
        }else {
            System.out.println("Broj a nije deljiv.");
        }

    }
}
