package d16_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if(i % 2 == 0){
                System.out.print(i*-1);
            }
            else if(i % 2 != 0){
                System.out.print(i);
            }
            if(i != 100){
                System.out.print(", ");
            }

        }
    }
}
