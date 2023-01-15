package p12_1_2023;
//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
//
public class Sastojak {
    private String nazivSastojka;
    private double cena;

//    Konstruktori
    public Sastojak (String nazivSastojka, double cena) {
        this.nazivSastojka = nazivSastojka;
        this.cena = cena;
    }
//    Getteri i setteri

    public String getNazivSastojka() {
        return nazivSastojka;
    }
    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
}
