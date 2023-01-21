package p19_1_2023;


//Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//stranice a i b
//gettere/settere/konstruktore
//implementira metodu povrsina
//implementira metodu obim
public class Pravougaonik extends Figura {
    private double a;
    private double b;
//    Konstruktor
    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }
//    Getteri i setteri

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double povrsina() {
        return this.a * this.b;
    }

    @Override
    public double obim() {
        return 2 * (this.a + this.b);
    }
}
