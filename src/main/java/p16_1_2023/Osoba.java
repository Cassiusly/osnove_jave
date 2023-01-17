package p16_1_2023;
//ak
//		Kreirati klasu Osoba koja od atributa ima:
// ime i prezime
// jmbg
//konstuktor sa parametrima
//metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
public class Osoba {
    protected String imePrezime;
    protected String jmbg;
//    Konstruktor
    public Osoba (String imePrezime, String jmbg) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
    }
//    Stampaj
    public void stampaj() {
        System.out.println(this.imePrezime + ", " + this.jmbg);
    }
}
