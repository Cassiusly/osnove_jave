package p10_1_2023Konstruktori;

public class Kupac {
    private String imePrezime;
    private ClanskaKarta clanskaKarta;

    // Konstruktor
    public Kupac(String imePrezime, ClanskaKarta clanskaKarta) {
        this.imePrezime = imePrezime;
        this.clanskaKarta = clanskaKarta;
    }

    // Getteri i setteri
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }
    public void setClanskaKarta(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    // Stampanje
    public void stampaj() {
        System.out.println(imePrezime + " - " + clanskaKarta.getBroj());
    }
}