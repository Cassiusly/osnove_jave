package p16_1_2023;
//Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//  konstruktor sa parametrima
//  implementira metodu koja vrsi transakciju, tako da na prosledjenu
//  sumu dodaje proviziju od 1.5 posto na sumu.
//  metoda naplatiOdrzavanje, koja sa racuna skida $2.
//  implementira metodu koja stampa podatke o kartici u formatu:
//	  Master Card: 12/2019, 4012-1239-1221-3381, $232
//	  u main funkciji, napraviti visa i master kartice i testirati funkcije
public class MasterKartica extends PlatnaKartica {

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
        super.stampaj();
    }
}
