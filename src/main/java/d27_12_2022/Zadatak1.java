package d27_12_2022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar
// prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost.
// Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod("Hrana za pse", 200.0, 1000.0);
        proizvod1.stampaj();

        double tezinaKG = proizvod1.konvertuj("kg");
        System.out.println("Tezina u kg: " + tezinaKG);

        double tezinaT = proizvod1.konvertuj("t");
        System.out.println("Tezina u t: " + tezinaT);

        System.out.println();

        Proizvod proizvod2 = new Proizvod("Laptop", 40000.0, 2200.0);
        proizvod2.stampaj();

        tezinaKG = proizvod2.konvertuj("kg");
        System.out.println("Tezina u kg: " + tezinaKG);

        tezinaT = proizvod2.konvertuj("t");
        System.out.println("Tezina u t: " + tezinaT);

    }
}
