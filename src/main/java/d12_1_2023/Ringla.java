package d12_1_2023;
//3.Zadatak (Za vezbanje)
//Kreirati klasu Ringla koja ima:
//tip ringle (obicna ili ekspres)
//jacinu
//za obicnu ringu jacina je u opsegu od 0 do 3
//za ekspres ringlu jacina je u opsegu od 0 do 12
//jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//getter za jacinu
//setteri ne postoje!!
//privatnu metodu koja vraca maksimalan broj pojacavanja
//za obicnu je 3, za ekspres je 12
//metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//metodu iskljuci ringlu - metoda postavlja jacinu na 0
//metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//metodu koja vraca potrosnju elektricne energije prema formuli
//100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi
//metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//metodu koja stampa podatke u formatu:
//	Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
public class Ringla {
    private String tipRingle; // obicna / ekspres
    private int jacina; // obicna 0-3 / ekspres 0-12
    private double jacinaGrejacaKW; // 0.8 / 1 / 1.5 ...

    // Konstruktor

    public Ringla(String tipRingle, double jacinaGrejacaKW) {
        this.tipRingle = tipRingle;
        this.jacinaGrejacaKW = jacinaGrejacaKW;
        this.jacina = 0;
    }

    // Getter
    public int getJacina() {
        return jacina;
    }

    // Metode
    private int maxPojacavanja() {
        if (this.tipRingle.equals("obicna")) {
            return 3;
        } else if (this.tipRingle.equals("ekspres")) {
            return 12;
        } else {
            return 0;
        }
    }

    public void pojacajRinglu() {
        if (this.tipRingle.equals("obicna")) {
            this.jacina++;
        } else if (this.tipRingle.equals("ekspres")) {
            this.jacina++;
        }
        if (this.tipRingle.equals("obicna") && this.jacina > 3) {
            this.jacina = 0;
        } else if (this.tipRingle.equals("ekspres") && this.jacina > 12) {
            this.jacina = 0;
        }

    }

    public void iskljuciRinglu() {
        this.jacina = 0;
    }

    public boolean ukljucenaRingla() {
        if (this.jacina > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double potrosnjaE(int satiRada) {
        return 100 / maxPojacavanja() * this.jacina * this.jacinaGrejacaKW * satiRada;
    }

    public void stampaj() {
        if (ukljucenaRingla()) {
            System.out.println("Ringla je ukljucena.");
        } else {
            System.out.println("Ringla je iskljucena.");
        }
        System.out.println("Tip ringle: " + this.tipRingle);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejacaKW + " kW.");
    }
}
