package d_26_12_2022;

import java.util.Scanner;

//Napisati funkciju koja vrsi konverziju eura u dinare,
// rublje ili dolare prema dole navedenoj konverziji.
// Metoda od parametara prima vrednost u eurima kao i
// valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB)
// a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//Primer poziva funkcija:
//Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//Primer izvrsenja main programa:
//Unesite vrednost u eurima: 3
//Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//Konverzija eura u druge valute:
//1 EUR = 117.5 RSD
//1 EUR = 1.1 USD
//1 EUR = 62.98 RUB
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite vrednost u evrima: ");
        double evro = sc.nextDouble();
        System.out.print("Unesite valutu za konverziju: ");
        String valuta = sc.next();
        double konvertovanaVrednost = konvertujEU(evro, valuta);
        System.out.printf("%.2f EUR je %.4f %s\n", evro, konvertovanaVrednost, valuta);

    }
    public static double konvertujEU(double evro, String valuta) {
        double konvertovanaVrednost = 0;

        if (valuta.equals("RSD")) {
            konvertovanaVrednost = evro * 117.5;
        } else if (valuta.equals("USD")) {
            konvertovanaVrednost = evro * 1.1;
        } else if (valuta.equals("RUB")) {
            konvertovanaVrednost = evro * 62.98;
        }

        return konvertovanaVrednost;
    }

}
