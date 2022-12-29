package d27_12_2022;

public class Proizvod {

        public String naziv;
        public double cena;
        public double tezina;

        public Proizvod(String naziv, double cena, double tezina) {
            this.naziv = naziv;
            this.cena = cena;
            this.tezina = tezina;
        }

        public void stampaj() {
            System.out.println(naziv + ", " + cena + ", " + tezina);
        }

        public double konvertuj(String jedinica) {
            if (jedinica.equals("kg")) {
                return tezina / 1000.0;
            } else if (jedinica.equals("t")) {
                return tezina / 1000.0 / 1000.0;
            } else {
                return tezina;
            }
        }
    }


