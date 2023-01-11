package p10_1_2023Konstruktori;
//2.Zad Kreirati klasu Radnik koja ima:
//jmbg radnika
//ime i prezime
//broj dece (1,2,3,... ili 0 ako nema dece)
//stepen strucne spreme (od 1 do 8)
//godine radnog staza
//konstuktor koji postavlja samo jmbg
//konstuktor koji postavlja sve atribute
//getere i setere
//metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//metodu koja racuna platu radnika, plata se racuna po formuli:
//25000 + (koeficijent slozenosti + minuli rad) * 10000
//metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)

//Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//- do 10 godina 0.05
//- od 10-20 godina 0.075
//- preko 20 godina 0.1
public class Zadatak2 {
    public static void main(String[] args) {
    Radnik r = new Radnik("12345567705", "Anita", "Nestorovic",
            2, 7, 15);
    Radnik r1 = new Radnik("4456789032");
        System.out.println("JMBG prvog radnika: " + r1.getJmbg());
        System.out.println("Ime i prezime drugog radnika: " + r.getIme() + " " + r.getPrezime());
        System.out.println("Broj dece drugog radnika: " + r.getBrojDece());
        System.out.println("Strucna sprema drugog radnika: " + r.getStepenStrucneSpreme());
        System.out.println("Godina radnog staza: " + r.getGodineRadnogStaza());
        System.out.println("Minuli rad: " + r.minuliRad());
        System.out.println("Koeficijent slozenosti: " + r.koeficijentSlozenosti());
        System.out.println("Plata: " + r.plata());
        System.out.println("Kreditno sposoban: " + r.kreditnoSposoban());

    }
}
