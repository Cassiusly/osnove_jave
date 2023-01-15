package p13_1_2023;

import java.util.ArrayList;

//Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din

//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
public class Pasta {
    private ArrayList <Sastojak> sastojak;

    public Pasta () {
        sastojak = new ArrayList<Sastojak>();
    }

    //    Metoda za dodavanja sastojaka
    public void dodajSastojak (Sastojak sastojak) {
        this.sastojak.add(sastojak);
    }
    //    Metoda koja racuna cenu paste
    public double racunajCenu () {
        double suma = 0;
        for (int i = 0; i < this.sastojak.size(); i++) {
            suma = suma + this.sastojak.get(i).getCena();
        }return suma;
    }

    //    Stampanje

    public void stampaj () {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < this.sastojak.size(); i++) {
            System.out.println(this.sastojak.get(i).getNaziv() + " - " +
                    this.sastojak.get(i).getCena());
        }
        System.out.println("Cena paste je " + racunajCenu() + ".din");
    }
    // Brisanje
    public void brisanjeSastojaka (String nazivSastojka) {
        for (int i = 0; i < this.sastojak.size(); i++) {
            if (nazivSastojka.equals(this.sastojak.get(i).getNaziv())) {
                sastojak.remove(i);
            }
        }
    }
}
