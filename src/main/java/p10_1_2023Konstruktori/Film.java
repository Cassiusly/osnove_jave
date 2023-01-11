package p10_1_2023Konstruktori;

public class Film {
        private String naziv;
        private int godina;

        // Konstruktor
        public Film(String naziv, int godina) {
            this.naziv = naziv;
            this.godina = godina;
        }
        //Getteri i setteri
        public String getNaziv() {
            return naziv;
        }

        public void setNaziv(String naziv) {
            this.naziv = naziv;
        }

        public int getGodina() {
            return godina;
        }

        public void setGodina(int godina) {
            this.godina = godina;
        }

        public void print() {
            System.out.println(naziv + ", " + godina);
        }
    }