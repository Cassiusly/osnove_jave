package d29_12_2022;

public class FacebookPost {
    private String imeObjavio;
    private String prezimeObjavio;
    private String imePostavljen;
    private String prezimePostavljen;
    private String tekst;
    private int brojLajkova;
    private int brojDeljenja;

    // Konstruktor klase
    public FacebookPost (String imeObjavio, String prezimeObjavio, String imePostavljen,
                         String prezimePostavljen, String tekst) {
        this.imeObjavio = imeObjavio;
        this.prezimeObjavio = prezimeObjavio;
        this.imePostavljen = imePostavljen;
        this.prezimePostavljen = prezimePostavljen;
        this.tekst = tekst;
    }
//    Getteri i setteri
    public String getImeObjavio() {
        return this.imeObjavio;
    }
    public String getPrezimeObjavio() {
        return this.prezimeObjavio;
    }
    public String getImePostavljen() {
        return this.imePostavljen;
    }
    public String getPrezimePostavljen() {
        return this.prezimePostavljen;
    }
    public String getTekst() {
        return this.tekst;
    }
    public int getBrojLajkova () {
        return this.brojLajkova;
    }
    public int getBrojDeljenja () {
        return this.brojDeljenja;
    }
    public void setImeObjavio (String imeObjavio) {
        this.imeObjavio = imeObjavio;
    }
    public void setPrezimeObjavio (String prezimeObjavio) {
        this.prezimeObjavio = prezimeObjavio;
    }
    public void setImePostavljen (String imePostavljen) {
        this.imePostavljen = imePostavljen;
    }
    public void setPrezimePostavljen (String prezimePostavljen) {
        this.prezimePostavljen = prezimePostavljen;
    }
    public void setTekst (String tekst) {
        this.tekst = tekst;
    }
//    Metode klase
    public int lajk () {
        return brojLajkova++;
    }
    public int dislike () {
        if (brojLajkova > 0) {
            return brojLajkova--;
        }
        return 0;
    }
    public int share () {
        return brojDeljenja++;
    }
    public void print () {
        System.out.println(this.imeObjavio + " " + this.prezimeObjavio + " >>> "
                + this.imePostavljen + " " + this.prezimePostavljen);
        System.out.println(this.tekst);
        System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
    }
}