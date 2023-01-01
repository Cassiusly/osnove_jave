package d29_12_2022;

public class Proizvod {
    private String naziv;
    private double cena;
    private double tezinaGr;

    // Konstruktor klase
    public Proizvod(String naziv, double cena, double tezinaGr) {
        this.naziv = naziv;
        this.cena = cena;
        this.tezinaGr = tezinaGr;
    }
        public void stampaj() {
            System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGr);
        }
        public double vratiCenuSaPopustom (double popust){
            return cena * (100 - popust) / 100;
        }
        public double racunajPostarinu () {
            if (tezinaGr <= 100) {
                return 200;
            } else if (tezinaGr <= 500) {
                return 400;
            } else {
                return 1000;
            }
        }
    }

