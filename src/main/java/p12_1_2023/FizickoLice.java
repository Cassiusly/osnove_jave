package p12_1_2023;
//Zadatak
//Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//ime i prezime
//broj licne karte
//jmbg
//podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//konstuktore
//gettere i settere, jmbg ne sme da se menja
//metodu stampaj, koja stmpa podatke u formatu:
//ime i prezime, broj licne karte
public class FizickoLice {
    private String imePrezime;
    private String brojLicneKarte;
    private String jmbg;
    private boolean vecKupovala;

    // Konstruktori
    public FizickoLice (){
    }
    public FizickoLice (String imePrezime, String brojLicneKarte, String jmbg, boolean vecKupovala) {
        this.imePrezime = imePrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.vecKupovala = vecKupovala;
    }
    // Getteri i setteri
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }
    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }
    public String getJmbg() {
        return jmbg;
    }
    public boolean isVecKupovala() {
        return vecKupovala;
    }
    public void setVecKupovala(boolean vecKupovala) {
        this.vecKupovala = vecKupovala;
    }
    public void stampaj () {
        System.out.println(this.imePrezime + ", " + brojLicneKarte);
    }
}
