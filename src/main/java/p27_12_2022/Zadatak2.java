package p27_12_2022;
// Krairti klasu SlackMessage koja ima:
//tekst poruke
//ime i prezime osobe koja je stavila poruku
//datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//U glavnom programu kreirati 2 slack poruke sa proizvoljnim
// podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]
//
//Dopuna:
//Dopunite klasu SlackMessage metodom za stampu koja stampa podatke
// u formatu koji je naveden iznad i u mainu pozovite metode nad objektima
// koje ste kreirali.
public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekstPoruke = "Hello!";
        poruka1.imeIPrezime = "Anita Nestorovic";
        poruka1.datumIVreme = "26.08.2021 18:55";
        System.out.println(poruka1.imeIPrezime + " - " + poruka1.datumIVreme);
        System.out.println(poruka1.tekstPoruke);

        poruka1.stampanje();

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekstPoruke = "Cao, cao!";
        poruka2.imeIPrezime = "Dobrivoje Vulic";
        poruka2.datumIVreme = "26.08.2021 18:59";
        System.out.println(poruka2.imeIPrezime + " - " + poruka2.datumIVreme);
        System.out.println(poruka2.tekstPoruke);

        poruka2.stampanje();

    }
}
