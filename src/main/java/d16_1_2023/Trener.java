package d16_1_2023;
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
public class Trener extends Osoba{
    private int godineIskustva;
    private String tip;
//    Konstruktori
    public Trener (){}
    public Trener (String imePrezime, String jmbg, int godRodjenja, int godineIskustva, String tip) {
        super (imePrezime, jmbg, godRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }
//    Getteri i setteri

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println(" God iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tip);
    }
}
