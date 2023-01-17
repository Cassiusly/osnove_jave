package p16_1_2023;
// Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
// ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje
// da podize novac u ekspozituri.
//getter i setter za ovlasceno lice
//konstruktor sa parametrima
//  implementira metodu izvrsiTransakciju,  tako da na prosledjenu
//  sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//  implementira metodu koja stampa podatke o kartici u formatu:
//	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
public class VisaKartica extends PlatnaKartica{
    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void izvrsiTransakciju (double iznos) {
        double provizija = iznos * 0.018;
        if (provizija < 4) {
            provizija = 4;
        } else if (this.suma >= iznos) {
            this.suma -= iznos;
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu.");
        }
    }
    @Override
    public void stampaj () {
        System.out.print("Visa Card: ");
        super.stampaj();
    }
}
