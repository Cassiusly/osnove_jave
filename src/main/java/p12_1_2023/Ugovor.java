package p12_1_2023;
//
//	Kreirati klasu Ugovor koja ima:
//  godinu, dan i mesec sklapanja ugovora
//  osobu koja prodaje nekretninu (fizicko lice)
//   osobu koja kupuje nekretninu (fizicko lice)
//   cenu za koju se prodaje nekretnina
//   adresu nekretnine (ulica br., grad)
//   metodu koja vraca procenat zarade
//   za osobu koja je vec kupovale nekretninu preko agencije je
//    0.02 dok je za one koji nisu 0.03
//     metodu koja racuna zaradu agencije pri prodaji nekretninte koja
//   ukljucujei poreze, takse i usluge agencije, prema formuli:
//    1000 + cena za koju se prodaje * procenat zarade
// metodu koja stampa ugovor u formatu:
//    Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju
//    (print prodavca) i (print kupca) o kupovini nekretnine (adresa)
//   po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji
//  isplati novcanu vrednost u iznosu od (zarada agencije)
//
public class Ugovor {
    private int godina;
    private int dan;
    private int mesec;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresa;

    // Konstruktor
    public Ugovor (int godina, int dan, int mesec, FizickoLice prodavac,
                   FizickoLice kupac, double cena, String adresa) {
        this.godina = godina;
        this.dan = dan;
        this.mesec = mesec;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }
    public double procenaZarade () {
        if (kupac.isVecKupovala()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }
    public double racunajZaraduAgencije () {
        return 1000 + cena * procenaZarade();
    }
    public void stampaj() {
        System.out.println("Dana: " + this.dan + "." + this.mesec + "." + this.godina +
                "god sklopljen je ugovor izmedju" + "\n" + this.prodavac.getImePrezime() + " i "
                + this.kupac.getImePrezime() + " o kupovini nekretnine " + this.adresa + "\n" +
                "po ceni od " + this.cena + " pri cemu je kupac u obavezi da agenciji\n" +
                "isplati novcanu vrednost u iznosu od " + racunajZaraduAgencije());
    }
}
