package d10_1_2023;
//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga
public class Zadatak1 {
    public static void main(String[] args) {
    Autor autor = new Autor("Oldos Haksli");
    Knjiga kniga = new Knjiga("9781604135794",
            "Vrli Novi Svet", 1931, autor);

    kniga.stampanje();
    }
}
