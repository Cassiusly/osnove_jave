package p17_1_2023;
//
//Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
// koja za cenu skolarine vraca 90000
// za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija

public class StudentOsnovnih extends Student {
    public StudentOsnovnih (String imePrezime, String indeks, int godinaStudija) {
        super (imePrezime, indeks, godinaStudija);
    }

    @Override
    public int getCenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean jeNaBudzetu() {
        if (this.godinaStudija < 5) {
            return true;
        } else {
            return false;
        }

    }
}
