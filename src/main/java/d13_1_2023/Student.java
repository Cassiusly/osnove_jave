package d13_1_2023;
//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imePrezime;
    private String tipStudija; // osnovne, master, doktorske
    private ArrayList<Ispit> nizIspita;

    // Konstruktori

    public Student(int brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.nizIspita = new ArrayList<Ispit>();

    }
    // Getteri i setteri

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    // Metoda dodaj ispit
    public void dodajIspit(Ispit ispit) {
        this.nizIspita.add(ispit);
    }

    // Metoda prosek
    public double prosek() {
        int polozenihIspita = 0;
        int zbirOcena = 0;
        for (int i = 0; i < this.nizIspita.size(); i++) {
            if (this.nizIspita.get(i).polozenIspit()) {
                polozenihIspita++;
                zbirOcena += this.nizIspita.get(i).getOcena();
            }
        }
        return zbirOcena / polozenihIspita;
    }

    // Stampanje
    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.imePrezime + " - " + this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < this.nizIspita.size(); i++) {
            this.nizIspita.get(i).stampaj();
        }
        System.out.println("Prosecna ocena: " + prosek());
    }
}