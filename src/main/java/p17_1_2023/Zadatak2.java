package p17_1_2023;
//	U glavnoj klasi kreirati studente i testirati funkciolanosti
public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih s1 = new StudentOsnovnih("Anita Nestorovic", "1111", 4);
        s1.stampaj();
        StudentMaster s2 = new StudentMaster("Anita Nestorovic", "1112", 3);
        s2.stampaj();
    }
}
