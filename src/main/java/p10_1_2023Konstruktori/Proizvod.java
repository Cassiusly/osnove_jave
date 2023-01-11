package p10_1_2023Konstruktori;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private double cenaIzrade;

    // Konstruktor
    public Proizvod(String naziv, Kupac kupac, double cenaIzrade) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }
    // Getteri i setteri
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public Kupac getKupac() {
        return kupac;
    }
    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }
    public double getCenaIzrade() {
        return cenaIzrade;
    }
    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
    // Metoda za racunanje cene proizvoda
    public double cenaProizvoda() {
        return cenaIzrade * 1.9 * (100 - kupac.getClanskaKarta().getPopust()) / 100;
    }
    // Stampanje
    public void stampaj() {
        System.out.println(naziv + " - " + cenaProizvoda());
        System.out.println(kupac.getImePrezime() + " - " + kupac.getClanskaKarta().getBroj());
    }
}
