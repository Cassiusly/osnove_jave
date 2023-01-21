package d19_1_2023;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanoviDoma = new ArrayList<>();

    // Konstruktor
    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;

    }

    // Getteri i setteri

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public void uclaniPlaninara(Planinar planinar) {
        this.clanoviDoma.add(planinar);
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public int brojUspesnih(Planina planina) {

        for(int i = 0; i < this.clanoviDoma.size(); i++) {
            if(this.clanoviDoma.get(i).usepsanUspon(planina)) {
                return i;
            }
        }
        return 0;
    }

    public void izbaciPlaninara(int id) {
        for (int i = this.clanoviDoma.size() - 1; i >= 0; i--) {
            if(this.clanoviDoma.get(i).getId() == id) {
                this.clanoviDoma.remove(i);
            }

        }
    }

    public void printAll() {
        System.out.println("Naziv doma: " + this.nazivDoma);
        System.out.println("Godina osnivanja: " + this.godinaOsnivanja);

        for(int i = 0; i < this.clanoviDoma.size(); i++) {
            this.clanoviDoma.get(i).stampaj();
        }
    }

    public int mesecniPrihod() {
        int ukupniPrihod = 0;
        for(int i = 0; i < this.clanoviDoma.size(); i++) {
            ukupniPrihod += this.clanoviDoma.get(i).clanarina();
        }
        return ukupniPrihod;
    }
}
