package p16_1_2023;
//	  u main funkciji, napraviti visa i master kartice i testirati funkcije
public class Zadatak2 {
    public static void main(String[] args) {
        VisaKartica visa = new VisaKartica(5000, "1234 5678 9101 1213",
                2023, 1, "Nikola Nikolic");
        MasterKartica master = new MasterKartica(10000, "4321 8765 1019 3121",
                2026, 12);
        visa.dodajSredstva(34000);
        visa.izvrsiTransakciju(9000);
        visa.stampaj();
        master.dodajSredstva(96000);
        master.izvrsiTransakciju(55000);
        master.stampaj();
    }
}
