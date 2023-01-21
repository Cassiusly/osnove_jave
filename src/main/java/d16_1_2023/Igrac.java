package d16_12_2022;

import java.util.ArrayList;

//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
public class Igrac extends Osoba{
    private int brojDresa;
    private String pozicija;
    ArrayList <Karton> karton = new ArrayList<>();
    private boolean jeKapiten;

    //    Defaultni konstruktor
    public Igrac () {}

    //    Konstruktor sa parametrima

    public Igrac(String imePrezime, String jmbg, int godRodjenja, int brojDresa, String pozicija, ArrayList<Karton> karton, boolean jeKapiten) {
        super(imePrezime, jmbg, godRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.karton = karton;
        this.jeKapiten = jeKapiten;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

//    Mtoda dodavanje katona
    public void dodajKarton () {

    }
}
