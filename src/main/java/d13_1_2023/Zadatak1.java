package d13_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("Racunarske nauke", 9, "Nikola Nikolic");
        Ispit ispit2 = new Ispit("Racunarske mreze", 6, "Pera Peric");
        Ispit ispit3 = new Ispit("Algoritmi i kombinatorika", 8, "Marko Markovic");

        Student anita = new Student(1111, "Anita Nestorovic", "Osnovne");
        anita.dodajIspit(ispit1);
        anita.dodajIspit(ispit2);
        anita.dodajIspit(ispit3);

        anita.stampaj();
    }
}
