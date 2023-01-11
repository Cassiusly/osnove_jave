package p10_1_2023Konstruktori;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;
//    Konstruktor
    public FacebookPost (String opis, Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }
    public void print () {
        korisnik.print();
        System.out.println(opis);
    }

}
