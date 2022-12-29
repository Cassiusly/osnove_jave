package d_26_12_2022;
//Napisati funkciju koja za tri prosledjena broja
// vraca najmanji od ta 3. U glavnom programu iskoristi
// funkciju i ispisti odgovarajucu poruku.
public class Zadatak8 {
    public static void main(String[] args) {
        int najmanji = najmanjiOdTri(5, 2, 3);
        System.out.println("Najmanji od 5, 2 i 3 je: " + najmanji);

        najmanji = najmanjiOdTri(10, 7, 12);
        System.out.println("Najmanji od 10, 7 i 12 je: " + najmanji);

        najmanji = najmanjiOdTri(4, 4, 4);
        System.out.println("Najmanji od 4, 4 i 4 je: " + najmanji);

    }
    public static int najmanjiOdTri(int x, int y, int z) {
        int najmanji = x;
        if (y < najmanji) najmanji = y;
        if (z < najmanji) najmanji = z;
        return najmanji;
    }

}
