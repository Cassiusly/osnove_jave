package p10_1_2023Konstruktori;

public class Radnik {
    private String jmbg;
    private String ime;
    private String prezime;
    private int brojDece;
    private int stepenStrucneSpreme;
    private int godineRadnogStaza;

//    Konstruktori
    public Radnik (String jmbg) {
        this.jmbg = jmbg;
    }
    public Radnik (String jmbg, String ime, String prezime, int brojDece,
                   int stepenStrucneSpreme, int godineRadnogStaza){
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }

//    Getteri i setteri
    public String getJmbg() {
        return jmbg;
    }
    public String getIme () {
        return ime;
    }
    public String getPrezime () {
        return prezime;
    }
    public int getBrojDece () {
        return brojDece;
    }
    public int getStepenStrucneSpreme () {
        return stepenStrucneSpreme;
    }
    public int getGodineRadnogStaza () {
        return godineRadnogStaza;
    }
    public void setJmbg (String jmbg) {
        this.jmbg = jmbg;
    }
    public void setIme (String ime) {
        this.ime = ime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }
    public void setBrojDece (int brojDece) {
        this.brojDece = brojDece;
    }
    public void setStepenStrucneSpreme (int stepenStrucneSpreme) {
        this.stepenStrucneSpreme = stepenStrucneSpreme;
    }
    public void setGodineRadnogStaza (int godineRadnogStaza) {
        this.godineRadnogStaza = godineRadnogStaza;
    }
//    Metoda minuli rad
    public double minuliRad () {
        double minuliRad = 0;
        if (godineRadnogStaza<= 10) {
            minuliRad = godineRadnogStaza * 0.05;
        } else if (godineRadnogStaza <= 20) {
            minuliRad = (10 * 0.05) + (godineRadnogStaza - 10);
        } else {
            minuliRad = (10 * 0.05) + (10 * 0.075) + (godineRadnogStaza - 20) * 0.1;
        }
        return minuliRad;
    }
    public int koeficijentSlozenosti (){
    return stepenStrucneSpreme* brojDece;
    }
    public double plata () {
        return 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
    }
    public boolean kreditnoSposoban () {
        return plata() > 50000;
    }
}
