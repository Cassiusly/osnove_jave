package d16_1_2023;
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
public class Zadatak1 {
    public static void main(String[] args) {
        Igrac i1 = new Igrac("Anita Nestorovic", "11112223345", 1995, 10, "Napadac",true);
        Igrac i2 = new Igrac("Ilija Nestorovic", "22233456789", 1998, 7, "Odbrana",false);
        System.out.println("Prvi igrac: ");
        i1.stampaj();
        System.out.println("Drugi igrac: ");
        i2.stampaj();
        Trener t1 = new Trener("Marko Markovic", "11122346789", 1970, 15, "Kondicioni");
        Trener t2 = new Trener("Nikola Nikolic", "99987552625", 1989, 10, "Za igru");
        System.out.println("Prvi trener: ");
        t1.stampaj();
        System.out.println("Drugi trener: ");
        t2.stampaj();
    }
}
