package d17_1_2023;

import java.sql.Time;

//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
public class Zadatak1 {
    public static void main(String[] args) {
    VideoPlayer videoPlayer = new VideoPlayer(1000, 500, 68, 720);
    TimeControl timeControl = new TimeControl(true);
    timeControl.izvrsiAkciju(videoPlayer);
    AudioControl audioControl = new AudioControl(true);
    audioControl.izvrsiAkciju(videoPlayer);
    QualityOptimizerControl qOC = new QualityOptimizerControl(100);
    qOC.izvrsiAkciju(videoPlayer);

    videoPlayer.stampaj();

    }
}
