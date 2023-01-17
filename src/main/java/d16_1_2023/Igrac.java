package d16_1_2023;
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;
//    Konstruktor default
    public Igrac () {
    }
    public Igrac (String imePrezime,String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
        super (imePrezime, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }
//    Getter i setteri

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        System.out.println("Kapiten: " + this.kapiten);
    }
}
