package p19_1_2023;
//Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//konstuktore
//porez racuna po formuli koeficijent * povrsina * 1.3
//prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
public class Lokal extends Objekat{

    public Lokal(String adresa, double povrsina, double zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double porez() {
        return koeficijent() * this.povrsina * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez: " + porez());
    }
}
