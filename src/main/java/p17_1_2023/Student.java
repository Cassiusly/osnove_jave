package p17_1_2023;
//Kreirati apstraktnu klasu Student koja ima:
//ime i prezime studenta
//broj indeksa
//godinu studija
//gettere, settere i konstruktore
//apstraktnu metodu koja vraca cenu skolarine.
//apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//metodu koja stampa podatke u formatu:
//ime i prezime, broj indeksa, godina studija
//Finansiranje: budzet/samofinansirajuci
//Cena skolarine: cena
public abstract class Student {
    protected String imePrezime;
    protected String indeks;
    protected int godinaStudija;

    //    Konstruktori
    public Student (String imePrezime, String indeks, int godinaStudija) {
        this.imePrezime = imePrezime;
        this.indeks = indeks;
        this.godinaStudija = godinaStudija;
    }

    // Getteri i setteri
    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
//    Apstraktna metoda koja vraca cenu skolarine
    public abstract int getCenaSkolarine();

//    Apstraktna metoda koja vraca da li je student na buzetu ili ne
    public abstract boolean jeNaBudzetu();

//    Stampanje
    public void stampaj () {
        System.out.println(this.imePrezime + ", " + this.indeks + ", " + this.godinaStudija);
        System.out.print("Finansiranje: ");
        if (jeNaBudzetu() == true) {
            System.out.println("budzet");
        } else {
            System.out.println("samofinansirajuci");
        }
        System.out.println("Cena skolarine: " + getCenaSkolarine());
    }

}
