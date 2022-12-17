package d16_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //TODO tekst zadatka

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x: ");
        int x = s.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(x + " x " + i +" = "+ x*i);
        }

    }
}
