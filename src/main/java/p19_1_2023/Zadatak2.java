package p19_1_2023;
//U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta i istestirati sve metode.
public class Zadatak2 {
    public static void main(String[] args) {
    PoreskaUprava pu = new PoreskaUprava("Kursumlija");
    Objekat kuca = new Kuca("Adresa 1", 60, 1, 4);
    Objekat zgrada = new Zgrada("Adresa 2", 1000, 2, 30);
    Objekat lokal = new Lokal("Adresa 3", 100, 3);

    pu.dodajObjekat(kuca);
    pu.dodajObjekat(zgrada);
    pu.dodajObjekat(lokal);

    pu.ukupanPorez();

    pu.stampajObjekte();

        System.out.println("Najmanji porez: " + pu.najmanjiPorez().porez());
        System.out.println("Najveci porez: " + pu.najveciPorez().porez());
    }
}
