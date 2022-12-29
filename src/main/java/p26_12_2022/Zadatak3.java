package p26_12_2022;
// Napisati metodu koja stampa zvezdicu sa razmakom.
//U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//*  *  *
//*  *
//*
public class Zadatak3 {
    public static void main(String[] args) {
       zvezdica();
        System.out.println();
    }
    public static void zvezdica() {
        for (int i = 0; i < 3; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
