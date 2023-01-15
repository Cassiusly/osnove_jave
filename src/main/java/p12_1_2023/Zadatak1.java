package p12_1_2023;
//Zadatak
//
//Kreirati klasu Korisnik koja ima:
//ime i prezime
//tip licence (basic/pro/premium)
//konstruktore. Po difoltu korisnik ima basic licencu.
//gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//ako je uplata 100, postavlja licencu na “pro”
//ako je uplata 150, postavlja licencu na “premium”
//Metoda kao parametar prima vrednost uplate $100 ili $150
//metodu ponisti pretplatu koja postavlja licencu na basic
//metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//ako je basic, vraca 40min
//ako je pro, vraca 240min
//ako je  premium, vraca 1440min
//metodu za stampu koja stampa u formatu:
//ime i prezime
//
//
//
//	Kreirati klasu ZoomCall koja ima:
//link za poziv
//password
//korisnika koji je host
//korisnika koji je guest
//gettere za sve atribute
//setter samo za guest-a
//metodu pokreni poziv koja stampa podatke u formatu:
public class Zadatak1 {
    public static void main(String[] args) {

        Korisnik host = new Korisnik("Anita Nestorovic");
        Korisnik guest = new Korisnik("Dobrivoje Vulic",
                "premium");

        ZoomCall zoomCall = new ZoomCall("https://us02web.zoom.us/j/",
                "sAJdlj6-h2", host);

        zoomCall.setGuest(guest);

        zoomCall.pokreniPoziv();

        host.pretplati(150);

    }
}
