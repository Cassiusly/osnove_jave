package d17_1_2023;
//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//gettere, settere i konstruktore
//implementira metodu izvrsi akciju tako sto postavlja kvalitet videa
// u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
public class QualityOptimizerControl extends Control{
    private double brzinaInterneta;

    //    Konstruktor
    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    //    Getteri i setteri
    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }
    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet = brzinaInterneta * 10.1;
        if (kvalitet < 144){
            videoPlayer.setVideo(144);
        } else if (kvalitet < 240) {
            videoPlayer.setVideo(240);
        } else if (kvalitet < 360) {
            videoPlayer.setVideo(360);
        } else if (kvalitet < 480) {
            videoPlayer.setVideo(480);
        } else if (kvalitet < 720) {
            videoPlayer.setVideo(720);
        } else {
            videoPlayer.setVideo(1080);
        }
    }
}
