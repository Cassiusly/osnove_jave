package d13_1_2023;
//
//Napisati klasu Ispit koja ima
//        naziv predmeta
//        ocenu (u rasponu od 5 do 10)
//        Ime i prezime profesora koji predaje predmet
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za sve atribute
//        metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//        metodu koja stampa ispit u formatu:
//        (naziv predmeta) - (profesor) - (ocena)

public class Ispit {
    private String nazivPredmeta;
    private int ocena; // od 5 - 10
    private String imeProfesora;

    // Konstruktori

    public Ispit(String nazivPredmeta, int ocena, String imeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeProfesora = imeProfesora;
    }
    // Getteri i setteri

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    // Metoda polozen ispit
    public boolean polozenIspit(){
        if(this.ocena >= 6 && this.ocena <= 10){
            return true;
        } else {
            return false;
        }
    }
    public void stampaj(){
        System.out.println(this.nazivPredmeta + " - " + this.imeProfesora + " - " + this.ocena);
    }
}
