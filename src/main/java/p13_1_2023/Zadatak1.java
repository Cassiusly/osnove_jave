package p13_1_2023;
//U glavnom programu kreirati objekte i testirati funkcionalnosti
public class Zadatak1 {
    public static void main(String[] args) {

        Sastojak sastojak1 = new Sastojak("jaja", 360);
        Sastojak sastojak2 = new Sastojak("piletina", 600);
        Sastojak sastojak3 = new Sastojak("zelena salata", 50);

        Pasta pasta = new Pasta();
        pasta.dodajSastojak(sastojak1);
        pasta.dodajSastojak(sastojak2);
        pasta.dodajSastojak(sastojak3);
        pasta.stampaj();

    }
}
