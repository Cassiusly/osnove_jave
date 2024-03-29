package p17_1_2023;
//  Napraviti klasu apstraktnu PlatnaKartica koja ima
//  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//  atribut broj kartice  primer: 4012-1239-1221-3381
//  atribut godina - godina do kada vazi kartica
//  atribut mesec-  mesec do kada vazi kartica
//  konstruktor sa parametrima
//  gettere za sve atribute, bez settera
//  metodu dodajSredstva koja povecava sumu za unetu vrednost
//  apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//  apstraktnu metodu koja stampa podatke o kartici.
public abstract class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    //Konstruktor
    public PlatnaKartica (double suma, String brojKartice, int godina, int mesec){
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }
    // Getteri

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }
    //    Metoda dodavanje sredstava
    public void dodajSredstva (double iznos) {
        this.suma += iznos;
    }
    //    Metoda izvrsenje transakcije
    public abstract void izvrsiTransakciju (double iznos);
    //    Stampanje
    public abstract void stampaj ();
}
