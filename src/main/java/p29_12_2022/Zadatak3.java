package p29_12_2022;
//2. Zadatak
//Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge
public class Zadatak3 {
    public static void main(String[] args) {
        Student anita = new Student();
        anita.setIme("Anita");
        anita.setPrezime("Nestorovic");
        anita.setIndex(1111);
        anita.setdaLijeNaBudzetu(true);

        System.out.println("First name: " + anita.getIme());
        System.out.println("Last name: " + anita.getPrezime());
        System.out.println("Index: " + anita.getIndex());
        System.out.println("Da li je na budzetu? " + anita.getdaLiJeNaBudzetu());
    }
}
