package p12_1_2023;

public class Korisnik {
    private String imePrezime;
    private String tipLicence; // cannot be changed

    //Konstruktori

    public Korisnik () {
    }

    public Korisnik(String imePrezime) {
        this.imePrezime = imePrezime;
        this.tipLicence = "basic";
    }
    public Korisnik(String imePrezime, String tipLicence) {
        this.imePrezime = imePrezime;
        this.tipLicence = "basic";
    }

    //Getteri i setteri
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getTipLicence() {
        return tipLicence;
    }

    // Metode
    public void pretplati(double suma) {
        if (suma == 100) {
            this.tipLicence = "pro";
        } else if (suma == 150) {
            this.tipLicence = "premium";
        }
    }
    public void ponistiPretplatu() {
        this.tipLicence = "basic";
    }
    public int getMaksDuzinaTrajanja() {
        if (this.tipLicence.equals("basic")) {
            return 40;
        } else if (this.tipLicence.equals("pro")) {
            return 240;
        } else {
            return 1440;
        }
    }
    public void stampanje() {
        System.out.println(imePrezime);
    }
}
