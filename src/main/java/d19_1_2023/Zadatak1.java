package d19_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Korpa korpa = new Korpa();
        Ambalaza t1 = new Tetrapak("13445-554", "Jogurt", 1.5, 1.9, true, 200);
        Ambalaza t2 = new Tetrapak("136678-504", "Cokoladno mleko", 1.2, 1.9, false, 180);
        Ambalaza f1= new StaklenaAmbalaza("888999990-11", "Rosa", 0.5, 0.9, 0, false, 100);
        Ambalaza f2= new StaklenaAmbalaza("112333450-21", "Nestea", 1.5, 2.0, 50, true, 150);

        korpa.dodajAmbalazu(t1);
        korpa.dodajAmbalazu(t2);
        korpa.dodajAmbalazu(f1);
        korpa.dodajAmbalazu(f2);

        t1.stampaj();
        t2.stampaj();
        f1.stampaj();
        f2.stampaj();

        SuperKartica kartica = new SuperKartica("1222-2340-0398-2320", "Anita Nestorovic", 10);

        System.out.println("Ukupna cena: " + korpa.ukupnaCenaKorpe(kartica));

    }
}
