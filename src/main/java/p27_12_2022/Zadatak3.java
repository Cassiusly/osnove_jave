package p27_12_2022;
//3.  Zadatak
//Kreirati klasu Auto koja ima:
//ime i prezime vozaca
//marku automobila
//broj vrata
//potrosnju na 100km (npr: 10)
//trenutnu brzinu kojom se auto krece
//metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//	Primer:
//Milan Jovanovic
//BMW - 5-ro vrata
//Sa potrosnjom od 10 l na 100km
//200 km/h je trenutna brzina

//(Dopuna)
//U okviru klase Auto, implementirati jos 2 metode:
//metoda koja vraca informaciju da li je vozac prekoracio brzinu.
// Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca
// true ili false ako je trenutna brzina veca od ogranicenja.
//metoda koja vraca visinu novcane kazne za prekoracenje, za svaku
// jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//U glavnom programu pozvati ove metode i odstmpajte neke poruke na
// osnovu informacija koje dobijete od njih.

//(Dopuna 2)
//Dopuniti klasu Auto tako da ima:
//atribut godinu proizvodnje
//atribut mesec do kad je registrovan auto (int)
//atribut kubikaza auta (npr: 1600 - 5000)
//metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni
// mesec i na osnovu toga vraca true ili false.
//metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena
// registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

public class Zadatak3 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.imeIPrezimeVozaca = "Anita Nestorovic";
        auto.markaAutomobila = "Audi A4 2006";
        auto.brojVrata = 5;
        auto.potrosnjaNa100km = 5;
        auto.trenutnaBrzina = 140;
        auto.godinaProizvodnje = 2006;
        auto.kubikazaAuta = 1900;
        auto.mesecRegistracije = 12;

        auto.stampanje();

        if (auto.prekoracenje(50)) {
            System.out.println("Desilo se prekoracenje!");
            System.out.println("Kazna je " + auto.kazna(50));
        } else {
            System.out.println("Nema prekoracenja.");
        }

        if(auto.oldTimer()) {
            System.out.println("Jeste oldtimer");
        } else {
            System.out.println("Nije oldtimer.");
        }

        if(auto.isteklaRegistracija(12)) {
            System.out.println("Istekla registracija");
        } else {
            System.out.println("Jos uvek je registrovan.");
        }

        System.out.println("Cena registracije " + auto.cenaRegistracije());

        }
    }
