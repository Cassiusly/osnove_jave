package p14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {


//        Napisati program koji sa tastature ucitava tri cela broja:
//        dan
//        mesec
//        godina
//        I formira datum u ispisu u formatu dan-mesec-godina

        Scanner s = new Scanner(System.in);

        System.out.print("dan ");
        int dan = s.nextInt();

        System.out.print("mesec ");
        int mesec = s.nextInt();

        System.out.print("godina ");
        int godina = s.nextInt();

        System.out.println(dan + "-" + mesec + "-" + godina);

    }
}
