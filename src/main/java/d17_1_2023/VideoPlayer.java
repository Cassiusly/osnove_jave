package d17_1_2023;
//Kreirati klasu VideoPlayer koja ima:
//duzinu videa
//trenutno vreme videa
//jacinu zvuka
//Kvalitet videa (144, 240, 360, 480, 720, 1080)
//gettere, settere i konstruktore
//metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa
public class VideoPlayer {
    private double duzina;
    private double trenutnoVreme;
    private double zvuk;
    private double video;
//Konstruktor
    public VideoPlayer(double duzina, double trenutnoVreme, double zvuk, double video) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.zvuk = zvuk;
        this.video = video;
    }
//    Getteri i setteri

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public double getZvuk() {
        return zvuk;
    }

    public void setZvuk(double zvuk) {
        this.zvuk = zvuk;
    }

    public double getVideo() {
        return video;
    }

    public void setVideo(double video) {
        this.video = video;
    }
//    Stampanje
    public void stampaj () {
        System.out.println(this.trenutnoVreme);
        System.out.println(this.zvuk);
        System.out.println(this.video);
    }
}
