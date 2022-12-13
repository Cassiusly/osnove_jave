package p13_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14.
//        Povrsina kruga je r (na kvadrat) * pi
//        Primer izvrsenja:
//        a: 5
//        Povrsina kvadrata je 25
//        r: 3
//        Povrsina kruga je 28.26

        Scanner s = new Scanner(System.in);

        System.out.print("a: " );
        double a = s.nextDouble();

        double pi = 3.14;
        System.out.println("Povrsina kvadrata je " + a * a);

        System.out.print("r: ");
        double r = s.nextDouble();

        System.out.println("Povrsina kruga je " + + r * r * pi);







    }
}
