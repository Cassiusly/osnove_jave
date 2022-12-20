package p19_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//        Izvrsenje:
//        2 na stepen 7 je 128

        int n = 7;
        int broj = 2;
        int izlazniBroj = broj;

        for (int i = 1; i < n; i++) {
            izlazniBroj *= broj;
        }
        System.out.println("2 na stepen 7 je " + izlazniBroj);

    }
}
