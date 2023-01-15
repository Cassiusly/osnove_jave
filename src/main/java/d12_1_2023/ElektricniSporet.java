package d12_1_2023;
//Kreirati klasu ElektricniSporet koja ima:
//marku storeta (npr: Beko, Bosh)
//garanciju kao broj godina
//maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//4 ringle
//gore levo
//gore desno
//dole levo
//dole desno
//konstruktor koji postavlja sve atribute
//gettere za sve atribut
//ne postoje setteri
//metodu pojacaj kojoj se prosledjuje pozicija ringle
//pozicija 1 je ringla gore levo
//pozicija 2 je ringla gore desno
//pozicija 3 je ringla dole levo
//pozicija 4 je ringla dole desno
//Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku,
// pogasite sve ringle sem one koja se pojacava u tom pozivu funkije
//Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//pozicija 1 je ringla gore levo
//pozicija 2 je ringla gore desno
//pozicija 3 je ringla dole levo
//pozicija 4 je ringla dole desno
//metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
//metodu koja stampa podatke u formatu:
public class ElektricniSporet {
    private String marka;
    private int garancijaUGodinama;
    private int maxUkljucenihRingli;

    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;


    // Konstruktor
    public ElektricniSporet(String marka, int garancijaUGodinama, int maxUkljucenihRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancijaUGodinama = garancijaUGodinama;
        this.maxUkljucenihRingli = maxUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }
    // Getteri
    public String getMarka() {
        return marka;
    }

    public int getGarancijaUGodinama() {
        return garancijaUGodinama;
    }

    public int getMaxUkljucenihRingli() {
        return maxUkljucenihRingli;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    // Metode
    public void pojacaj(int pozicijaRingle){
        if(pozicijaRingle == 1){
            this.goreLevo.pojacajRinglu();
        } else if (pozicijaRingle == 2){
            this.goreDesno.pojacajRinglu();
        } else if (pozicijaRingle == 3){
            this.doleLevo.pojacajRinglu();
        } else if (pozicijaRingle == 4) {
            this.doleDesno.pojacajRinglu();
        }

        int ukljuceneRingle = 0;
        if(this.goreLevo.ukljucenaRingla()){
            ukljuceneRingle++;
        }if (this.goreDesno.ukljucenaRingla()) {
            ukljuceneRingle++;
        }if (this.doleLevo.ukljucenaRingla()) {
            ukljuceneRingle++;
        }if (this.doleDesno.ukljucenaRingla()) {
            ukljuceneRingle++;
        }

        if (this.maxUkljucenihRingli < ukljuceneRingle) {
            if (this.goreLevo.ukljucenaRingla() && pozicijaRingle != 1) {
                iskljuciRinglu(1);
            }
            if (this.goreDesno.ukljucenaRingla() && pozicijaRingle != 2) {
                iskljuciRinglu(2);
            }
            if (this.doleLevo.ukljucenaRingla() && pozicijaRingle != 3) {
                iskljuciRinglu(3);
            }
            if (this.doleDesno.ukljucenaRingla() && pozicijaRingle != 4) {
                iskljuciRinglu(4);
            }
        }

    }
    public void iskljuciRinglu(int pozicijaRingle){
        if(pozicijaRingle == 1){
            this.goreLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 2){
            this.goreDesno.iskljuciRinglu();
        } else if (pozicijaRingle == 3){
            this.doleLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 4) {
            this.doleDesno.iskljuciRinglu();
        }
    }
    public double racunajPotrosnju(int vremeRada){
        return this.goreLevo.potrosnjaE(vremeRada) + this.goreDesno.potrosnjaE(vremeRada) +
                this.doleLevo.potrosnjaE(vremeRada) + this.doleDesno.potrosnjaE(vremeRada);
    }
    public void stampaj() {
        System.out.println(this.marka + " - Garancija: " + this.garancijaUGodinama + " god.");
        System.out.println("Gore levo: ");
        this.goreLevo.stampaj();
        System.out.println("Gore desno: ");
        this.goreDesno.stampaj();
        System.out.println("Dole levo: ");
        this.doleLevo.stampaj();
        System.out.println("Dole desno:");
        this.doleDesno.stampaj();
        System.out.println("_________________________________________");
    }
}
