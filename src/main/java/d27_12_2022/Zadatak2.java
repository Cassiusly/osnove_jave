package d27_12_2022;
//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu
//atribut za mod (hladi/greje) - string
//metodu za stampu (proizvoljno)
//metodu koja vraca informaciju da li je napolju veca temperatura
// od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
public class Zadatak2 {
    public static void main(String[] args) {
        SmartAirConditioning klima1 = new SmartAirConditioning("Samsung", 22, "hladi");
        klima1.stampaj();

        boolean vecaNapolju = klima1.vecaNapolju(25);
        System.out.println("Veca napolju: " + vecaNapolju);

        System.out.println();

        SmartAirConditioning klima2 = new SmartAirConditioning("Galanz", 20, "greje");
        klima2.stampaj();

        vecaNapolju = klima2.vecaNapolju(15);
        System.out.println("Veca napolju: " + vecaNapolju);
 

    }
}
