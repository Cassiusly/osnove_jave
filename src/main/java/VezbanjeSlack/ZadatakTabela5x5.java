package VezbanjeSlack;

import java.util.ArrayList;
import java.util.Scanner;

public class ZadatakTabela5x5 {
    public static void main(String[] args) {

        ArrayList<Integer>nizBrojeva=new ArrayList<>();
        Scanner s = new Scanner(System.in);
        nizBrojeva.add(3);
        nizBrojeva.add(1);
        nizBrojeva.add(8);
        nizBrojeva.add(0);
        nizBrojeva.add(1);
        nizBrojeva.add(1);
        nizBrojeva.add(5);
        nizBrojeva.add(7);
        nizBrojeva.add(9);
        nizBrojeva.add(6);
        nizBrojeva.add(3);
        nizBrojeva.add(1);
        nizBrojeva.add(6);
        nizBrojeva.add(5);
        nizBrojeva.add(1);
        nizBrojeva.add(4);
        nizBrojeva.add(5);
        nizBrojeva.add(8);
        nizBrojeva.add(1);
        nizBrojeva.add(7);
        nizBrojeva.add(1);
        nizBrojeva.add(3);
        nizBrojeva.add(2);
        nizBrojeva.add(8);
        nizBrojeva.add(0);
        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i) + ", ");
            if (i==4) {
                System.out.println();
            }
            if (i==9) {
                System.out.println();
            }
            if (i==14) {
                System.out.println();
            }
            if (i==19) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.print("Unesite kolone od 0-4: ");
        int n = s.nextInt();
        int zbir = 0;
        for (int i = n; i < nizBrojeva.size(); i=i+5) {
            zbir = zbir + nizBrojeva.get(i);
        }
        System.out.print("Zbir je: " + zbir);
    }
}
