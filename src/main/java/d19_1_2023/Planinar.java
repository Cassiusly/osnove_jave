package d19_1_2023;

public abstract class Planinar {
    protected int id;
    protected String imePrezime;

    public Planinar(int id, String imePrezime) {
        this.id = id;
        this.imePrezime = imePrezime;
    }

    public int getId() {
        return id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public abstract void stampaj();
    public abstract double clanarina();
    public abstract boolean usepsanUspon(Planina planina);


}
