package d19_1_2023;
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
public class StaklenaAmbalaza extends Ambalaza{
    private double kaucijaFlasa;
    private boolean placaKauciju;
    private double osnovnaCena;

    //    Konstruktor

    public StaklenaAmbalaza(String barKod, String naziv, double neto, double bruto, double kaucijaFlasa, boolean placaKauciju, double osnovnaCena) {
        super(barKod, naziv, neto, bruto);
        this.kaucijaFlasa = kaucijaFlasa;
        this.placaKauciju = placaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    //    Getteri i setteri

    public double getKaucijaFlasa() {
        return kaucijaFlasa;
    }

    public void setKaucijaFlasa(double kaucijaFlasa) {
        this.kaucijaFlasa = kaucijaFlasa;
    }

    public boolean isPlacaKauciju() {
        return placaKauciju;
    }

    public void setPlacaKauciju(boolean placaKauciju) {
        this.placaKauciju = placaKauciju;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (placaKauciju) {
            return this.osnovnaCena * 1.2 + this.kaucijaFlasa;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barKod);
        System.out.println("Naziv artikla: " + this.naziv);
        System.out.println("Neto tezina: " + this.neto);
        System.out.println("Bruto tezina: " + this.bruto);
        System.out.println("Placena kaucija: " + this.placaKauciju);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }
}
