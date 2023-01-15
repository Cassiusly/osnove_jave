package p13_1_2023;

import java.util.ArrayList;

//
//Kreirati klasu FacebookPost koja ima:
//ime i prezime korisnika koji je stavio oglas
//tekst objave
//niz reakcija
//metodu reaguj, koja dodaje reakciju u niz
//(modifikacija za vezbu) Ukoliko se desi situacija da jedan
// isti korisnik reaguje na post (tj. postoji rekacija korisnika sa
// istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//Primer: Milan - lajkuje
//Nemanja - lajkuje
//Milan - daje srce
public class FacebookPost {
    private String imePrezime;
    private String tekst;
    private ArrayList<Reakcija> reakcije;


    //    Konstruktor
    public FacebookPost() {
        this.reakcije = new ArrayList<>();
    }

    public FacebookPost(String imePrezime, String tekst) {
        this.imePrezime = imePrezime;
        this.tekst = tekst;
        reakcije = new ArrayList<>();
    }

    //    Metoda reaguj
    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < reakcije.size(); i++) {
            if (reakcije.get(i).getImePrezime().equals(reakcija.getImePrezime())) {
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija);
    }

    // Metoda izbroj reakcije
    public int izbrojReakcije(String tip) {
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTipReakcije().equals(tip)) {
                counter++;
            }
        }
        return counter;
    }

    // Stampanje

    public void stampaj() {
        System.out.println("IME I PREZIME: " + this.imePrezime);
        System.out.println("OPIS: " + this.tekst);
        System.out.print("Lajk " + this.izbrojReakcije("lajk") + " | ");
        System.out.print("Srce " + this.izbrojReakcije("srce") + " | ");
        System.out.print("Smajli " + this.izbrojReakcije("smajli") + " | ");
    }
}
