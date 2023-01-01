package p29_12_2022;

import p27_12_2022.Auto;

//(Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//atribut za maksimalnu brzinu na auto (npr: 240)
//Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//  |||||||||||||||||||||||||||||||||||||||||.....................................................................
//  100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje
// oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.
//
//Dopuniti klasu Auto tako da ima:
//kapacitet rezervoara
//trenutnu kolicinu goriva u rezervoaru (u litrima)
//metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca
// novcanu vrednost goriva. Litar goriva je 210din.. Vodite racuna da trenutna kolicina
// goriva ne predje kapacitet rezervoara, takodje ukoliko se unese kolicina koja prelazi
// kapacitet, tu kolicinu koja prelazi ne racunate u cenu.
public class Zadatak2 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.maxBrzina= 240;
        auto.dodajGas(100);
        auto.koci();
        auto.stampajTablu();


    }
}
