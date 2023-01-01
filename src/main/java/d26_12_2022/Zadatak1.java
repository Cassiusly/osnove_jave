package d26_12_2022;
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
// prosledjena vrednost za 10 veca.Iz main-a pozvati
// izvrsenje metode za razlicite vrednosti.
public class Zadatak1 {
    public static void main(String[] args) {

            stampajVrednostZa10Vecu(5);  // Output: 15
            stampajVrednostZa10Vecu(10);  // Output: 20
            stampajVrednostZa10Vecu(-5);  // Output: 5
        }
    public static void stampajVrednostZa10Vecu(int vrednost) {
        System.out.println(vrednost + 10);
    }
}
