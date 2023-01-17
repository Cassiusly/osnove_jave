package p17_1_2023;

import p16_1_2023.PlatnaKartica;

public class MasterKartica extends PlatnaKartica {

    //Konstruktor
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double iznos) {
        double provizija = iznos * 0.015;
        if (suma >= iznos) {
            this.suma -= (iznos + provizija);
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu.");
        }
    }
    public void naplatiOdrzavanje () {
        izvrsiTransakciju(2);
    }
    @Override
    public void stampaj() {
        System.out.print("Master Card: ");
        System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", " + "$" + this.suma);

    }
}