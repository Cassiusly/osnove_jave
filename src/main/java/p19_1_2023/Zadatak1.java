package p19_1_2023;

import java.util.ArrayList;

//Zadatak
//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve
// povrsine i obime i za svaku figuru ispisati ponaosob
public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Figura> figure = new ArrayList<Figura>();
        figure.add(new JednakostranicniTrougao(5));
        figure.add(new JednakostranicniTrougao(7));
        figure.add(new Pravougaonik(5,5));
        figure.add(new Pravougaonik(2,2));
        figure.add(new Pravougaonik(3,5));


        double ukupnaPovrsina = 0;
        double ukupanObim = 0;
        for (int i = 0; i < figure.size(); i++) {
            ukupnaPovrsina += figure.get(i).povrsina();
            ukupanObim += figure.get(i).obim();
            System.out.println(figure.get(i).povrsina());
            System.out.println(figure.get(i).obim());
        }

        System.out.println("Ukupna povrsina: " + ukupnaPovrsina);
        System.out.println("Ukupan obim: " + ukupanObim);
    }

}
