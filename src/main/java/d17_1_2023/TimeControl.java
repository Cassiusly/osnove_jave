package d17_1_2023;
//Kreirati klasu TimeControl koja nasledjuje klasu Control i
//konstruktore
//ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
// unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
public class TimeControl extends Control{
    private boolean jeUnapred;
    public TimeControl(boolean jeUnapred) {
        this.jeUnapred = jeUnapred;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (jeUnapred) {
            if(videoPlayer.getTrenutnoVreme() + 15 > videoPlayer.getDuzina()) {
                videoPlayer.setTrenutnoVreme(videoPlayer.getDuzina());
            } else {
                videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme()+15);
            }
                if (videoPlayer.getTrenutnoVreme() - 15 < 0) {
                    videoPlayer.setTrenutnoVreme(0);
                } else {
                    videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
                }
            }
        }
    }

