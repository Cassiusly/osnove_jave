package p26_12_2022;

public class Zadatak1 {
//    Zadatak
//Napisati metodu koja stampa ime i prezime i u glavnom
// programu pozvati metodu na izvrsenje 5 puta.

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            imePrezime();
        }

    }
    public static void imePrezime() {
        System.out.println("Anita Nestorovic");
    }
}
