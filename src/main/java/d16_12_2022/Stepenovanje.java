package d16_12_2022;

public class Stepenovanje {
    public static void main(String[] args) {
        int n = 10;
        int broj = 2;
        int izlazniBroj = broj;
        for (int i = 1; i < n; i++) {
            izlazniBroj *= broj;
        }
        System.out.println("Pow = "+izlazniBroj);
    }
}
