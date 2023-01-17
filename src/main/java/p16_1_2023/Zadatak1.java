package p16_1_2023;
//			U glavnom programu kreirati 2 studenta i 2 profesora.
public class Zadatak1 {
    public static void main(String[] args) {
        Student s1 = new Student("Anita Nestorovic", "23059956783",
                1111, 10000);
        Student s2 = new Student("Iliija Nestorovic", "2305992233",
                2222, 20000);
        Profesor p1 = new Profesor("Marko Markovic", "33445567889",
                "Predmet 1", 70000);
        Profesor p2 = new Profesor("Nikola Nikolic", "22334455667",
                "Predmet 2", 90000);







        s2.uplatiSkolarinu(20000);

        p1.povecajPlatu(10);


    }
}
