package d19_1_2023;

public class Planina {

    private String nazivPlanine;
    private String nazivDrzave;
    private double visinaPlanine;

    //    Konstruktor
    public Planina(String nazivPlanine, String nazivDrzave, double visinaPlanine) {
        this.nazivPlanine = nazivPlanine;
        this.nazivDrzave = nazivDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    //    Getteri i setteri


    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
