package p26_12_2022;
// Napisati dve metode, jedna metoda sluzi za stampanje imena
// a druga sluzi za stampanje prezimena. U glavnom programu
// pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//Primer izvrsenja:
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
public class Zadatak2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ime();
            prezime();
        }
    }
    public static void ime() {
    System.out.print("Anita ");
}
    public static void prezime() {
    System.out.println("Nestorovic");
}
}
