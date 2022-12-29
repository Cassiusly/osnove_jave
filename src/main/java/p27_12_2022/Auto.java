package p27_12_2022;

public class Auto {
    public String imeIPrezimeVozaca;
    public String markaAutomobila;
    public int brojVrata;
    public int potrosnjaNa100km;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecRegistracije;
    public int kubikazaAuta;


    public void stampanje() {
        System.out.println(this.imeIPrezimeVozaca);
        System.out.println(this.markaAutomobila + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100km + " l na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
    }

    public boolean prekoracenje(int ogranicenje) {
        if (this.trenutnaBrzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    public int kazna(int ogranicenje) {
        if (this.trenutnaBrzina > ogranicenje) {
            return (this.trenutnaBrzina - ogranicenje) * 1000;
        } else {
            return 0;
        }
    }

    public boolean oldTimer() {
        if (this.godinaProizvodnje < 1950) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isteklaRegistracija(int trenutniMesec) {
        if (trenutniMesec > mesecRegistracije) {
            return true;
            } else {
            return false;
}
    }
    public int cenaRegistracije () {
        int cena = kubikazaAuta * 100;
        if (kubikazaAuta > 2000) {
            cena = cena * 130 / 100;
        }
                return cena;
        }
}
