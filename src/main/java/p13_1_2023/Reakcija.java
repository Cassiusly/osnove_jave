package p13_1_2023;
//Kreirati klasu Reakcija koja ima
//tip reakcije (smajli, like, srce)
//ime i prezime korisnika koji je reagovao
//gettere, settere i konstruktore
public class Reakcija {
    private String tipReakcije;
    private String imePrezimeReakcija;

    //    Konstruktor
    public Reakcija (String tipReakcije, String imePrezime) {
        this.tipReakcije = tipReakcije;
        this.imePrezimeReakcija = imePrezime;
    }

    // Getteri i setteri
    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getImePrezime() {
        return imePrezimeReakcija;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezimeReakcija = imePrezime;
    }
}