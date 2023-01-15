package d12_1_2023;
//Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1%
//S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna
public class Transakcija {
    private int idTransakcije;
    private Racun placa;
    private Racun prima;

    // Getteri setteri
    public int getIdTransakcije() {
        return idTransakcije;
    }

    public Racun getPlaca() {
        return placa;
    }

    public Racun getPrima() {
        return prima;
    }

    // Konstruktor
    public Transakcija(int id, Racun placa, Racun prima) {
        this.idTransakcije = id;
        this.placa = placa;
        this.prima = prima;
    }

    // Metoda provizija
    private double provizija(double suma) {
        if (suma < 4500) {
            return 0.45;
        } else {
            return 0.01;
        }
    }

    // Metoda transakcija
    public void izvrsiTransakciju(double suma) {
        if (this.placa.getStanjeNaRacunu() >= suma + provizija(suma)) {

            this.placa.promenaStanja(-suma - provizija(suma));
            this.prima.promenaStanja(suma);
        } else {
            System.out.println("Na racunu nema dovoljno sredstava.");
        }
    }

    public void stampaj() {
        System.out.println("ID Transakcije: " + this.idTransakcije);
        System.out.println("Racun sa: " + this.placa.getImePrezime() + " - " + this.placa.getBrojRacuna());
        System.out.println("Racun na: " + this.prima.getImePrezime() + " - " + this.prima.getBrojRacuna());
    }
}