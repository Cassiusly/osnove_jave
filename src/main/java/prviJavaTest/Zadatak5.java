package prviJavaTest;
//Napisati metodu koja radi pakovanje nekog teksta u HTML elemente.
// Metoda kao parametar prima tekst i tip, a vraca HTML element (String)
// sa proslednjenim tekstom.
//Metoda podrzava sledece tipove:
//bold, metoda pakuje tekst u <b>prosledjen tekst</b>
//italic, metoda pakuje tekst u <em>proslednjen tekst</em>
//paragraph, metoda pakuje tekst u <p>prosledjen tekst</p>
//Ukoliko se prosledi tip koji nije podrzan, vraca se neupakovan tekst tj.
// vraca se nakav kakav je dosao umetodu
//U glavnom programu koristeci kreiranu metodu napisati porogram koji prikazuje sledeci tekst.
//<b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
//<p>Naravno samo je falio paragraf</p>
public class Zadatak5 {
    public static void main(String[] args) {
        System.out.print(pakovanjeHTML("Ovaj deo je bold", "bold") + ", ");
        System.out.println(pakovanjeHTML("a ovo je italic", "italic"));
        System.out.println(pakovanjeHTML("Naravno samo je falio paragraf", "paragraph"));
    }
    public static String pakovanjeHTML (String tekst, String tip) {
        if (tip.equals("bold")) {
            return "<b>" + tekst + "</b>";
        } else if (tip.equals("italic")) {
            return "<em>" + tekst + "</em>";
        } else if (tip.equals("paragraph")) {
            return "<p>" + tekst + "</p>";
        } else {
            return tekst;
        }
    }
}
