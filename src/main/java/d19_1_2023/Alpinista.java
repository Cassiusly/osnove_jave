package d19_1_2023;

public class Alpinista extends Planinar {
    private int poeni;

//    Konstruktor

    public Alpinista(int id, String imePrezime, int poeni) {
        super(id, imePrezime);
        this.poeni = poeni;
    }

//    Getteri i setteri

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public double clanarina() {
        int popust = this.poeni * 50;
        return 1500 - popust;
    }
//    Metode

    @Override
    public boolean usepsanUspon(Planina planina) {
        if(planina.getVisinaPlanine() <= 4000) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + this.id);
        System.out.println("Ime: " + this.imePrezime);
        System.out.println("Broj poena: " + this.poeni);
    }
}

