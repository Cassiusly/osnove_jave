package p16_1_2023;
//Kreirati klasu DUOPaket koaj nasledjuje klasu Paket i koja ima:
//ovaj paket ima 6 meseci po dinar
//naziv paketa je EON FULL DUO
//uredjaj koji dodatno ide uz ovaj paket (moze biti fiksni/mobilni/tablet/laptop)
//brzina interneta ovog paketa je 250/100 MB
//metodu za povecanje brzine interneta, kao parametar se unosi koliko je to uvecanje
//metodu za stampu
//ime i prezime korisnika
//naziv paketa - brzina download/brzina upload - ugovorna obaveza
//cena + broj meseci za dinar
public class DUOPaket extends Paket {
    private int mesecPoDinar = 6;
    private String nazivPaketa = "EON FULL PAKET";
    private int download = 250;
    private int upload = 100;
    private String uredjaj;

    //    Konstruktor
    public DUOPaket(String nazivPaketa, String imePrezime, double mesecnaCena, int ugovornaObaveza, int mesecPoDinar, String uredjaj, int download, int upload) {
        super(nazivPaketa, imePrezime, mesecnaCena, ugovornaObaveza, download, upload);
        this.mesecPoDinar = mesecPoDinar;
        this.uredjaj = uredjaj;
    }
//    Metoda povecanja brzine interneta
    public void povecajBrzinuInterneta (int uvecanje) {
        this.download += uvecanje;
        this.upload += uvecanje;
    }
//    Stampanje
    @Override
    public void stampaj () {
    super.stampaj();
        System.out.println(this.mesecnaCena + " + " + this.mesecPoDinar);
    }
}
