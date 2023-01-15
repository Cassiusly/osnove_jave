package d12_1_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        Racun racun1 = new Racun("170-289328923-23", "Anita Nestorovic", 1000);
        Racun racun2 = new Racun("170-289328923-24", "Ilija Nestorovic", 2000);

        Transakcija transakcija1 = new Transakcija(1, racun1, racun2);
        transakcija1.izvrsiTransakciju(500);
        transakcija1.stampaj();
    }

}
