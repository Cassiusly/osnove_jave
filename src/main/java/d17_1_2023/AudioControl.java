package d17_1_2023;
//Kreirati klasu AudioControl koja nasledjuje klasu Control i
//gettere, settere i konstruktore
//ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
public class AudioControl extends Control{
    private boolean pojacava;

// Konstruktor
    public AudioControl(boolean pojacava) {
        this.pojacava = pojacava;
    }

//    Getteri i setteri

    public boolean isPojacava() {
        return pojacava;
    }

    public void setPojacava(boolean pojacava) {
        this.pojacava = pojacava;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.pojacava) {
            if (videoPlayer.getZvuk() + 1 > 100) {
                videoPlayer.setZvuk(100);
            } else {
                videoPlayer.setZvuk(videoPlayer.getZvuk() + 1);
            }
        } else {
            if (videoPlayer.getZvuk() - 1 < 0) {
                videoPlayer.setZvuk(0);
            }
        }
    }
}
