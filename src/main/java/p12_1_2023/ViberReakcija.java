package p12_1_2023;
//Kreirati klasu ViberReakcija koja ima:
//emoji (moze da bude sunglases, heart, smile, like ili sad)
//korisnika koji je reagovao
//U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.
public class ViberReakcija {
    private String emoji;
    private ViberKorisnik korisnik;
    //Konstruktor
    public ViberReakcija (String emoji, ViberKorisnik korisnik) {
        this.emoji = emoji;
        this.korisnik = korisnik;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ViberKorisnik korisnik) {
        this.korisnik = korisnik;
    }
}
