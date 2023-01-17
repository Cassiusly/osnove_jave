package p16_1_2023;
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba,
//koja od dodatnih atributa ima:
//broj indeksa
// dug za skolarinu
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
// Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
public class Student extends Osoba{
    private int brojIndeksa;
    private double dugZaSkolarinu;

//    Konstruktor

    public Student(String imePrezime, String jmbg, int brojIndeksa, double dugZaSkolarinu) {
        super(imePrezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
//    Metoda uplata
    public void uplatiSkolarinu (double iznosUplate) {
        this.dugZaSkolarinu -= iznosUplate;
    }
//    Stampanje
    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Broj indeksa " + this.brojIndeksa);
        System.out.println("Dug za skolarinu " + this.dugZaSkolarinu);
    }
}
