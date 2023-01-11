package p10_1_2023Konstruktori;
//3.Zadatak
//Kreirati klasu Film koja ima:
//naziv filma
//iz koje godine je film
//konstruktore, gettere i settere
//metodu print koja stampa podatke u formatu
//naziv filma, godina
//
//
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
public class Zadatak3 {
    public static void main(String[] args) {
    Film film = new Film("Coherence", 2013);
    film.print();
    Reziser reziser = new Reziser("James Ward Byrkit", 37);
    reziser.print();
    }
}
