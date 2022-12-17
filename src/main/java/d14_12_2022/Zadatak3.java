package d14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {


//        Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//        Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

                Scanner s = new Scanner(System.in);

                System.out.println("Unesite tx1: ");
                int tx1 = s.nextInt();
                System.out.println("Unesite ty1: ");
                int ty1 = s.nextInt();
                System.out.println("Unesite tx2: ");
                int tx2 = s.nextInt();
                System.out.println("Unesite ty2: ");
                int ty2 = s.nextInt();
                System.out.println("Unesite mx: ");
                int mx = s.nextInt();
                System.out.println("Unesite my: ");
                int my = s.nextInt();
                int temp = 0;

                if (tx1 > tx2) {
                    temp = tx2;
                    tx2 = tx1;
                    tx1 = temp;
                }

                if (ty1 > ty2) {
                    temp = ty2;
                    ty2 = ty1;
                    ty1 = temp;
                }


                if ((mx >= tx1) && (mx <= tx2) && (my >= ty1) && (my <= ty2)) {
                    System.out.println("Kliknuto je unutar forme.");
                } else {
                    System.out.println("Nije kliknuto unutar forme.");
                }


            }

        }





