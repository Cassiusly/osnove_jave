package p10_1_2023Konstruktori;

public class Korisnik {
    private String ime;
    private String prezime;

//    Konstruktor
    public Korisnik (String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
//    Getteri i setteri
    public String getIme () {
        return ime;
    }
    public String getPrezime () {
        return prezime;
    }
    public void setIme (String ime) {
        this.ime = ime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }
    public void print () {
        System.out.println(ime + " " + prezime);
    }
}
