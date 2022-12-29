package p26_12_2022;
//Napisati metodu koja proverava da li je trougao pravougli.
// Metoda prima stranice trougla i hipotenuzu trougla.
// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c
public class Zadatak9 {
    public static void main(String[] args) {
        boolean trougao = jePravougli(3,4,5);
        if (trougao) {
            System.out.println("Jeste pravougli.");
        } else {
            System.out.println("Nije pravougli.");
        }

    }
    public static boolean jePravougli (int a, int b, int c) {
        if (a*a+b*b==c*c) {
            return true;
        } else {
            return false;
        }
    }
}
