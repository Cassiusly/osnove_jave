package d19_1_2023;
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
public class Tetrapak extends Ambalaza{
    private boolean reciklirano;
    private double osnovnaCena;

//    Konstruktor

    public Tetrapak(String barKod, String naziv, double neto, double bruto, boolean reciklirano, double osnovnaCena) {
        super(barKod, naziv, neto, bruto);
        this.reciklirano = reciklirano;
        this.osnovnaCena = osnovnaCena;
    }

//    Getteri i setteri

    public boolean isReciklirano() {
        return reciklirano;
    }

    public void setReciklirano(boolean reciklirano) {
        this.reciklirano = reciklirano;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (reciklirano){
            return tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barKod);
        System.out.println("Naziv artikla: " + this.naziv);
        System.out.println("Neto tezina: " + this.neto);
        System.out.println("Bruto tezina: " + this.bruto);
        System.out.println("Recikliran: " + this.reciklirano);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }
}
