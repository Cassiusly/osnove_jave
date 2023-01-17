package p16_1_2023;
//Kreirati klasu Paket koja ima:
//naziv paketa
//ime i prezime korisnika
//mesecnu cenu
//ugovorna obaveza
//brzina interneta za download
//brzina interneta za upload
//getere, setere i konstuktore koji su logicni (brzine interneta nije moguce menjati kao i naziv paketa)
//metodu produzi ugovor koja produzava ugovor za 12 meseci
//metodu koja vraca broj meseci koliko korisnik ima po dinar. Uvek vraca nulu
//metodu za stampu koja stampa podatke u formatu:
//ime i prezime korisnika
//naziv paketa - brzina download/brzina upload - ugovorna obaveza
//cena
public class Paket {
    protected String nazivPaketa;
    protected String imePrezime;
    protected double mesecnaCena;
    protected int ugovornaObaveza;
    protected int download;
    protected int upload;
//    Konstruktor
    public Paket (String nazivPaketa, String imePrezime, double mesecnaCena, int ugovornaObaveza, int download, int upload) {
        this.nazivPaketa = nazivPaketa;
        this.imePrezime = imePrezime;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.download = download;
        this.upload = upload;
    }
//    Getteri i setteri

    public String getNazivPaketa() {
        return nazivPaketa;
    }

    public void setNazivPaketa(String nazivPaketa) {
        this.nazivPaketa = nazivPaketa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getMesecnaCena() {
        return mesecnaCena;
    }

    public void setMesecnaCena(double mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public int getUpload() {
        return upload;
    }

    public void setUpload(int upload) {
        this.upload = upload;
    }
//    Metoda produzi ugovor
    public void produziUgovor () {
        this.ugovornaObaveza += 12;
    }
//    Metoda vraca broj meseci koliko korisnik ima po dinar.
    public int brojMeseci () {
        return 0;
    }
//    Stampanje
    public void stampaj () {
        System.out.println(this.imePrezime);
        System.out.println(this.nazivPaketa + " - " + this.download + "/" + this.upload + " - " + this.ugovornaObaveza);
    }
}
