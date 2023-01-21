package d19_1_2023;

import java.util.ArrayList;

//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
public class Korpa {
    ArrayList<Ambalaza> ambalaze;

    public Korpa(){
        ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza ambalaza) {
        this.ambalaze.add(ambalaza);
    }
    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
              if (ambalaze.get(i).getBarKod().equals(barkod)) {
                ambalaze.remove(i);
            }
        }
    }
    private double cenaSvihAmbalazaPopust (double popust) {
        double cena = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cena += this.ambalaze.get(i).cenaArtikla() + (this.ambalaze.get(i).cenaArtikla() * popust / 100);
        }
        return cena;
    }
    public double ukupnaCenaKorpe(SuperKartica kartica){

        return cenaSvihAmbalazaPopust(kartica.getPopust());
    }
}
