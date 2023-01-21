package p19_1_2023;

public class Trougao extends Figura{
    private double a;
    private double b;
    private double c;

    public Trougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double povrsina() {
        double s = (a + b + c) / 2;
        return s;
    }

    @Override
    public double obim() {
        return a + b + + c;
    }
}
