package p17_1_2023;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    //Konstruktor
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
        System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", " + "$" + this.suma);

    }
}
