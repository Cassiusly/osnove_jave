package p17_1_2023;
//Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//koja za cenu skolarine vraca 100000
//za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija

public class StudentMaster  extends Student{
    public StudentMaster (String imePrezime, String indeks, int godinaStudija) {
        super (imePrezime,indeks,godinaStudija);
    }
    @Override
    public int getCenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean jeNaBudzetu() {
        if (this.godinaStudija < 2) {
            return true;
        } else {
            return false;
        }

    }
}
