package d19_1_2023;
//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj
public abstract class Ambalaza {
    protected String barKod;
    protected String naziv;
    protected double neto;
    protected double bruto;

//    Kontruktori

    public Ambalaza(){
    }
    public Ambalaza(String barKod, String naziv, double neto, double bruto) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.neto = neto;
        this.bruto = bruto;
    }

//    Getteri i setteri

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getNeto() {
        return neto;
    }


    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }
    // Metoda koja racuna tezinu pakovanja kao razliku bruto i neto tezine

    public double tezinaPakovanja(){
        return this.bruto - this.neto;
    }
    public abstract double cenaArtikla();
    public abstract void stampaj();

}
