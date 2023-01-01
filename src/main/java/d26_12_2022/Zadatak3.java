package d26_12_2022;
//
//Napisati funkciju koja za dva jednocifrena broja koja su
// ulazni parametri funkcije vraca novu vrednost koja se
// formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
//
public class Zadatak3 {
    public static void main(String[] args) {
        System.out.println(formirajNovuVrednost(2, 3)); // 23
        System.out.println(formirajNovuVrednost(6, 2)); // 62
    }
    public static int formirajNovuVrednost(int br1, int br2) {
        int novaVrednost = Integer.parseInt(String.valueOf(br1) + String.valueOf(br2));
        return novaVrednost;
    }
}
