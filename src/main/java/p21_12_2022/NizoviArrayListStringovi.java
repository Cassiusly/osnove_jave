package p21_12_2022;

import java.util.ArrayList;

public class NizoviArrayListStringovi {
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.get(0);

        cars.set(0, "Opel");

        cars.remove(0);



    }
}
