package d10_1_2023;
public class Proizvod2 {
    private String sifra;
    private String naziv;
    private double cenaPoKG;

    // Konstruktor
    public Proizvod2(String sifra, String naziv, double cenaPoKG) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKG = cenaPoKG;
    }

    // Getteri i setteri
    public String getSifra() {
        return sifra;
    }
    public void setSifra(String sifra) {
        this.sifra = sifra;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void setCenaPoKG(double cenaPoKG) {
        this.cenaPoKG = cenaPoKG;
    }
    public double getCenaKg() {
        return cenaPoKG;
    }
    public void setGetCenaKg(double cenaPoKG) {
        this.cenaPoKG = cenaPoKG;
    }
    public double getCenaLb() {
        return cenaPoKG * 2.2046;
    }

    // Stampanje
    public void stampanje () {
        System.out.println(sifra + " - " + naziv);
    }
}