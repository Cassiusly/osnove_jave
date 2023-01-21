package d19_1_2023;
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
public class SuperKartica {
    private String brojKartice;
    private String imePrezime;
    private double popust;

    //    Konstruktori
    public SuperKartica(){}

    public SuperKartica(String brojKartice, String imePrezime, double popust) {
        this.brojKartice = brojKartice;
        this.imePrezime = imePrezime;
        this.popust = popust;
    }

    //    Getteri i setteri

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    public void stampaj() {
        System.out.println(this.brojKartice + ", " + this.imePrezime);
    }
}
