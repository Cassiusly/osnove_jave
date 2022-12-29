package p26_12_2022;
// Napisati metodu stampajApsolutnuVrednost,
// koja stampa apsolutnu vrednost   prosledjene vrednosti.
public class Zadatak5 {
    public static void main(String[] args) {
    stampajApsolutnuVrednost(-5);
    }
    public static void stampajApsolutnuVrednost(int a){
    if (a < 0) {
        System.out.println( a * (-1));
    } else {
        System.out.println(a);
    }
    }
}
