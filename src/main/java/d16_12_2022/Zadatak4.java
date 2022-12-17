package d16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite dimenziju table: ");
        int dimenzija = s.nextInt();
        int dimenzijaKv = dimenzija * dimenzija;


        for (int i = 1; i <= dimenzijaKv; i++) {
            System.out.print("_|");

            if(i % dimenzija == 0){
                System.out.println();
            }
        }
    }
}
