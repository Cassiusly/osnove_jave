package d12_1_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Ringla goreLevo = new Ringla("obicna", 0.8);
        Ringla goreDesno = new Ringla("obicna", 0.8);
        Ringla doleLevo = new Ringla("ekspres", 1.5);
        Ringla doleDesno = new Ringla("ekspres", 1.5);

        ElektricniSporet slobodaCacak = new ElektricniSporet("Sloboda Cacak", 20, 3, goreLevo, goreDesno, doleLevo, doleDesno );
        slobodaCacak.stampaj();
        System.out.println("Potrosnja je: " + slobodaCacak.racunajPotrosnju(5) + " kW.");
        System.out.println("_______________________________________");

        slobodaCacak.pojacaj(1);
        slobodaCacak.stampaj();
        System.out.println("Potrosnja je: " + slobodaCacak.racunajPotrosnju(3) + " kW.");
        System.out.println("_______________________________________");

        slobodaCacak.pojacaj(2);
        slobodaCacak.pojacaj(3);
        slobodaCacak.stampaj();
        System.out.println("Potrosnja je: " + slobodaCacak.racunajPotrosnju(4) + " kW.");
        System.out.println("_______________________________________");

        slobodaCacak.pojacaj(4);
        slobodaCacak.stampaj();
        System.out.println("Potrosnja je: " + slobodaCacak.racunajPotrosnju(2) + " kW.");
        System.out.println("_______________________________________");

        slobodaCacak.pojacaj(1);
        slobodaCacak.pojacaj(2);
        slobodaCacak.stampaj();
        System.out.println("Potrosnja je: " + slobodaCacak.racunajPotrosnju(1) + " kW.");
        System.out.println("_______________________________________");

        slobodaCacak.pojacaj(3);
        slobodaCacak.stampaj();
        System.out.println("Potrosnja je: " + slobodaCacak.racunajPotrosnju(2) + " kW.");
        System.out.println("_______________________________________");
    }
}
