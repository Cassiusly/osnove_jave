package p12_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        FizickoLice prodavac = new FizickoLice("Anita Nestorovic", "00946362", "2503995762783",
                                                false);
        FizickoLice kupac = new FizickoLice("Dobrivoje Vulic", "28933842", "2871987348929",
                                            true);
        Ugovor ugovor = new Ugovor(2022, 12,1, prodavac, kupac, 4000000, "Avde Karabegovica 3, Beograd");

        ugovor.stampaj();
    }
}
