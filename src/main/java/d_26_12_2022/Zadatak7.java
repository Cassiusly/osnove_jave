package d_26_12_2022;
//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
public class Zadatak7 {
    public static void main(String[] args) {
        int brojCelihBrojeva = izbroji(5, 10);
        System.out.println("Ima " + brojCelihBrojeva + " celih brojeva izmedju 5 i 10.");

        brojCelihBrojeva = izbroji(-5, 1);
        System.out.println("Ima " + brojCelihBrojeva + " celih brojeva izmedju -5 i 1.");

    }
    public static int izbroji(int m, int n) {
        int brojCelihBrojeva = 0;
        for (int i = m; i <= n; i++) {
            brojCelihBrojeva++;
        }
        return brojCelihBrojeva;
    }
}
