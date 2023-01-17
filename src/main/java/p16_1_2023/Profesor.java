package p16_1_2023;
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
public class Profesor extends Osoba{
    private String nazivPredmeta;
    private double iznosPlate;

//    Konstruktor
    public Profesor(String imePrezime, String jmbg, String nazivPredmeta,
                    double iznosPlate) {
        super(imePrezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }
//    Metoda povecaj platu
    public void povecajPlatu (double procenat) {
        this.iznosPlate += this.iznosPlate * (procenat / 100);
    }
//    Stampanje
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Naziv predmeta: " + this.nazivPredmeta);
        System.out.println("Iznos plate: " + this.iznosPlate);
    }
}
