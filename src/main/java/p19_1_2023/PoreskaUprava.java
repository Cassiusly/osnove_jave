package p19_1_2023;

import java.util.ArrayList;

//Kreirati klasu PoreskaUprava koja za atribute ima:
//ime grada u kom se nalazi
//niz objekata
//metodu dodaj objekat
//(ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//(za vezbanje) metodu koja vraca objekat sa najmanjim porezom
//metodu koja racuna ukupan porez za ceo grad
//metodu koja stampa sve objekte
public class PoreskaUprava {
    private String imeGrada;
    private ArrayList<Objekat> objekti = new ArrayList<>();

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }
    public void dodajObjekat (Objekat objekat) {
        this.objekti.add(objekat);
    }
//    Metoda najveci porez
    public Objekat najveciPorez() {
        double porez = this.objekti.get(0).porez();
        int pozicija = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).porez() > porez){
               porez = this.objekti.get(i).porez();
               pozicija = i;
            }
        }
        return this.objekti.get(pozicija);
    }

//    Metoda najmanji porez
    public Objekat najmanjiPorez() {
        Objekat najmanji = this.objekti.get(0);

        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).porez() <= najmanji.porez()) {
                najmanji = this.objekti.get(i);
            }
        }
        return najmanji;
    }

        public double ukupanPorez () {
            double ukupanPorez = 0;
            for (int i = 0; i < this.objekti.size(); i++) {
                ukupanPorez += this.objekti.get(i).porez();
            }
            return ukupanPorez;
    }
    public void stampajObjekte() {
        for (int i = 0; i < this.objekti.size(); i++) {
            objekti.get(i).stampaj();
        }
    }
}

