package d10_1_2023;

public class Autor {
    private String imeIPrezime;

    // Konstruktor
    public Autor (String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getImeIPrezime () {
        return imeIPrezime;
    }
    public void setImeIPrezime (String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    // Stampanje
    public void stampanje () {
        System.out.print(imeIPrezime);
    }
}
