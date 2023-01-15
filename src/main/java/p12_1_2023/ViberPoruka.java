package p12_1_2023;
//Kreirati klasu ViberPoruka koja ima:
//tekst poruke
//vreme kad je poslata poruka
//korisnika koji je poslao poruku
//korisnika kome je poslata poruka
//gettere i setere i konstuktore
//rekaciju na poruku
//metodu prikazi koja stampa podatke o poruci u formatu:
//From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//To: [Ime i prezime korisnika kome je poslata]
//[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
//if (this.reakcija != null)
public class ViberPoruka {
    private String tekstPoruke;
    private String vremePoslatePoruke;
    private ViberKorisnik posiljalac;
    private ViberKorisnik primalac;
    private ViberReakcija reakcija;

    // Konsturktor
    public ViberPoruka (String tekstPoruke, String vremePoslatePoruke, ViberKorisnik posiljalac, ViberKorisnik primalac) {
        this.tekstPoruke= tekstPoruke;
        this.vremePoslatePoruke = vremePoslatePoruke;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    // Getteri i setteri
    public String getTekstPoruke() {
        return tekstPoruke;
    }
    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }
    public String getVremePoslatePoruke() {
        return vremePoslatePoruke;
    }
    public ViberKorisnik getPosiljalac() {
        return posiljalac;
    }
    public ViberKorisnik getPrimalac() {
        return primalac;
    }
    public ViberReakcija getReakcija() {
        return reakcija;
    }
    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }
    // Metoda
    public void prikazi() {

        String aktivnost = this.posiljalac.isTrenutnoAktivan() ? "Active now" : "Not Active";
        System.out.println("From: " + this.posiljalac.getImePrezime() + " * " + aktivnost + " -at " +
                this.vremePoslatePoruke);
        System.out.println("To: " + this.primalac.getImePrezime());
        System.out.println(this.tekstPoruke);
    // Provera da li reakcija postoji
        if (this.reakcija != null) {
            System.out.println(" : " + this.reakcija.getEmoji() + " from " +
                    this.reakcija.getKorisnik().getImePrezime());
        }
    }
}
