package p12_1_2023;
//Kreirati klasu ViberKorisnik koja ima:
//ime i prezime
//broj telefona
//da li je trenutno aktivan (boolean)
//gettere, settere, konstuktore
public class ViberKorisnik {
    private String imePrezime;
    private String brojTelefona;
    private boolean trenutnoAktivan;

    //Konstruktori
    public ViberKorisnik () {
    }
    public ViberKorisnik (String imePrezime, String brojTelefona, boolean trenutnoAktivan) {
        this.imePrezime = imePrezime;
        this.brojTelefona = brojTelefona;
        this.trenutnoAktivan = trenutnoAktivan;
    }
    // Getteri i setteri

    public String getImePrezime() {
        return imePrezime;
    }
    public String getBrojTelefona() {
        return brojTelefona;
    }
    public boolean isTrenutnoAktivan() {
        return trenutnoAktivan;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    public void setTrenutnoAktivan(boolean trenutnoAktivan) {
        this.trenutnoAktivan = trenutnoAktivan;
    }
}
