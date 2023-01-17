package p16_1_2023;
//Za vezbanje

public class Zadatak3 {
    public static void main(String[] args) {
        EONPaket p1 = new EONPaket("Light", "Anita Nestorovic", 3500, 2, 3, 150, 75);
        p1.stampaj();
        DUOPaket p2 = new DUOPaket("Full", "Anita Nestorovic", 6500, 1, 6, "Telefon", 250, 100);
        p2.povecajBrzinuInterneta(50);
        p2.produziUgovor();
        System.out.println("Nakon produzenja ugovora: ");
        p2.stampaj();
    }
}
