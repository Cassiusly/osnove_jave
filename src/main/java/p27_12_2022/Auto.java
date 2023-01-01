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
    public int brojRegistracije;
    public boolean klimaUpaljena;
    public int maxBrzina;
    public int kapacitetRezervoara;
    public int trenutniRezervoar;

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

    public int cenaRegistracije() {
        int cena = kubikazaAuta * 100;
        if (kubikazaAuta > 2000) {
            cena = cena * 130 / 100;
        }
        return cena;
    }

    public void dodajGas(int kolicinaGasa) {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
        this.trenutnaBrzina += kolicinaGasa;
        if (this.trenutnaBrzina > this.maxBrzina) {
            this.trenutnaBrzina = this.maxBrzina;
        }
    }

    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if (trenutnaBrzina < 0) {
            trenutnaBrzina = 0;
        }
    }

    public double potrosnjaAuta(double potrosnja) {
        double faktorKlime = 1.0;
        if (klimaUpaljena) {
            faktorKlime = 1.2;
        }
        return potrosnja * faktorKlime;
    }

    public void stampajTablu() {
        int procenat = (this.trenutnaBrzina * 100) / this.maxBrzina;

        for (int i = 0; i < 100; i++) {

            if (i <= procenat) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }

//        }
//        public int natociGorivo (int litarNatocen) {
//        int cenaGorivaPoLitru = 210;
//        if (kapacitetRezervoara > 1) {
//
//        }
//
//        }
//}
    }
}