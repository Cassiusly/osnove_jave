package d12_1_2023;

//Kreirati klasu Racun koja ima:
//broj racuna (npr: 170-289328923-23)
//ime i prezime osobe
//trenutno stanje na racunu (npr: 100, 1220)
//gettere i setter za sve atribute, sem settera za stanje na racunu
//metodu koja menja stanje na racunu za prosledjenu vrednost
// (stanje na racunu ne moze da bude manje od nule)
//metodu koja stampa podatke o racunu u formatu:
//Ime i prezime  -  broj racuna
//stanje na racunu je (trenutno stanje) rsd.
public class Racun {
    private String brojRacuna;
    private String imePrezime;
    private double stanjeNaRacunu;


    // Getteri i setteri
    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
    // Konstruktori
    public Racun(String brojRacuna, String imePrezime, int stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imePrezime = imePrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    // Metoda promena stanja
    public void promenaStanja (double transakcija){
        if (this.stanjeNaRacunu + transakcija < 0){
            System.out.println("Stanje ne moze da bude manje od nule.");
        } else {
            this.stanjeNaRacunu += transakcija;
        }
    }
    public void stampaj(){
        System.out.println(this.imePrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je " + this.stanjeNaRacunu + " rsd.");;
    }

}
