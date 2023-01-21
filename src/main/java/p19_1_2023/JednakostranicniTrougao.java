package p19_1_2023;


//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//stranicu a
//gettere/settere/konstruktore
//implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//implementira metodu obim
public class JednakostranicniTrougao extends Figura {
    private double a;

//    Konstruktor
    public JednakostranicniTrougao(double a) {
        this.a = a;
    }
//    Getteri i setteri

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return (this.a * this.a) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return 3 * this.a;
    }
}
