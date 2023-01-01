package p29_12_2022;

import p27_12_2022.Auto;

//(Dopuna 3)
//Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
//public class Zadatak1 {
//    public static void main(String[] args) {
//        Auto auto = new Auto();
//        auto.brojRegistracije = 123456;
//        auto.klimaUpaljena = true;
//        auto.potrosnjaAuta(7.5);
//        System.out.println("Trenutna potrosnja auta sa klimom je: " +
//                auto.potrosnjaAuta(7.5) + auto.klimaUpaljena);
////        auto.dodajGas();
//        System.out.println("Trenutna brzina: " + auto.trenutnaBrzina);
//        auto.koci();
////        System.out.println("Trenutna brzina: " + auto.trenutnaBrzina);
//    }
//}
