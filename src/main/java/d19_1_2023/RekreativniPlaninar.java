package d19_1_2023;

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUspon;

    //    Konstruktor
    public RekreativniPlaninar(int id, String imePrezime, int tezinaOpreme, String nazivOkruga, int maksimalniUspon) {
        super(id, imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }


    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean usepsanUspon(Planina planina) {
        int maksimalniUsponOprema = this.maksimalniUspon + this.tezinaOpreme * 50;

       if(maksimalniUsponOprema < planina.getVisinaPlanine()) {
            return true;
       } else {
           return false;
       }
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + this.id);
        System.out.println("Ime: " + this.imePrezime);
        System.out.println("Okrug: " + this.nazivOkruga);
    }


}
