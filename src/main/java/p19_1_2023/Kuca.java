package p19_1_2023;
//Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//konstuktore, gettere i setter
//porez racuna po formuli: koeficijent * povrsina.
//prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

public class Kuca extends Objekat{
    private int brojClanova;
    public Kuca (String adresa, double povrsina, double zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porez() {
        return koeficijent() * this.povrsina;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.brojClanova);
        System.out.println("Porez: " + porez());
    }
}
