package d19_1_2023;

public class ZadatakVezbanje2 {
    public static void main(String[] args) {
        PlaninarskiDom dom = new PlaninarskiDom("Mountain Lodge", 1998);
        Planinar nikola = new RekreativniPlaninar(31234, "Nikola Nikolic", 18, "Toplicki", 2100);
        Planinar marko = new RekreativniPlaninar(41253, "Marko Markovic", 20, "Nisavski", 2000);
        Planinar aljosa = new Alpinista(64223, "Aljosa Aljosevic", 4);
        Planinar milos = new Alpinista(33221, "Milos Milosevic", 2);
        Planinar dusan = new Alpinista(12345, "Dusan Dusanovic", 6);
        Planina kopaonik = new Planina("Kopaonik", "Srbija", 2017);
        Planina monblan = new Planina("Alpi", "Francuska", 4807);

        dom.uclaniPlaninara(nikola);
        dom.uclaniPlaninara(marko);
        dom.uclaniPlaninara(aljosa);
        dom.uclaniPlaninara(milos);
        dom.uclaniPlaninara(dusan);

        System.out.println("Broj uspesnih za Kopaonik: " + dom.brojUspesnih(kopaonik));
        System.out.println("Broj uspesnih za Mon Blan: " + dom.brojUspesnih(monblan));

        System.out.println("Mesecni prihod: " + dom.mesecniPrihod());
        dom.izbaciPlaninara(12345);
        dom.printAll();


    }
}
