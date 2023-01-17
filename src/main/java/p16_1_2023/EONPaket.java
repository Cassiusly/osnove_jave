package p16_1_2023;
//Kreirati klasu EONPaket koja nasledjuje klasu Paket i koja ima:
//ovaj paket ima 3 meseca po dinar
//ovaj paket se zove EON LIGHT DUO
//brzina interneta ovog paketa je 150/75 MB
//metodu za stampu koja stampa podatke u formatu:
//ime i prezime korisnika
//naziv paketa - brzina download/brzina upload - ugovorna obaveza
//cena + broj meseci za dinar
public class EONPaket extends Paket{
    private int mesecPoDinar = 3;
    private String nazivPaketa = "Eon Light";
    private int download = 150;
    private int upload = 75;

//    Konstruktor
    public EONPaket(String nazivPaketa, String imePrezime, double mesecnaCena, int ugovornaObaveza, int mesecPoDinar, int download, int upload) {
        super(nazivPaketa, imePrezime, mesecnaCena, ugovornaObaveza, download, upload);
        this.mesecPoDinar = mesecPoDinar;
    }
    @Override
    public int brojMeseci () {
        return  mesecPoDinar;
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println(this.mesecnaCena + " + " + this.mesecPoDinar);
    }
}
