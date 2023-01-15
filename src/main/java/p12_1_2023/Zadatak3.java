package p12_1_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        ViberKorisnik korisnik1 = new ViberKorisnik("Anita Nestorovic", "0649818731", true);
        ViberKorisnik korisnik2 = new ViberKorisnik("Dobrivoje Vulic", "063009954", false);
        ViberPoruka poruka1 = new ViberPoruka("Cao!","9:22", korisnik1, korisnik2);
        ViberReakcija reakcija = new ViberReakcija("heart", korisnik2);
        poruka1.setReakcija(reakcija);
        poruka1.prikazi();

        ViberPoruka poruka2 = new ViberPoruka("Cao, sta radis?", "9:25", korisnik2, korisnik1);
        ViberReakcija reakcija2 = new ViberReakcija("strawberry", korisnik1);
        poruka2.setReakcija(reakcija2);
        poruka2.prikazi();

    }
}
