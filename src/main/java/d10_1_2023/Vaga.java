package d10_1_2023;
public class Vaga {
     private String mernaJedinica;
     private Proizvod2 proizvod2;

    // Defaultni konsturktor
    public Vaga () {
    }

    // Getteri i setteri
    public String getMernaJedinica () {
        return mernaJedinica;
    }
    public void setMernaJedinica (String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }
    public Proizvod2 getProizvod2 () {
        return proizvod2;
    }
    public void setProizvod2 (Proizvod2 proizvod2) {
        this.proizvod2 = proizvod2;
    }

    // Metode
    public double sracunajCenu (double tezina) {
        if (mernaJedinica.equals("kg")) {
            return getProizvod2().getCenaKg() * tezina;
        } else {
            return getProizvod2().getCenaLb() * tezina;
        }
    }
    public void stampanje (double tezina) {
        getProizvod2().stampanje();
        double cena = sracunajCenu(tezina);
        if (mernaJedinica.equals("kg")) {
            System.out.println(getProizvod2().getCenaKg() + " " + mernaJedinica + " x " + tezina);
        } else if (mernaJedinica.equals("lb")){
            System.out.println(getProizvod2().getCenaLb() + " " + mernaJedinica + " x " + tezina);
        }
        System.out.println("Ukupno: " + cena);
    }
}
