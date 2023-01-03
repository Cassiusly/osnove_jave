package miniProjekat;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeX;
    private String imeO;
    private String unosXO;
    private String naPotezu = "X";

    //Getteri i setteri
    public String getImeX() {
        return this.imeX;
    }
    public String getImeO() {
        return this.imeO;
    }
    public String getNaPotezu() {
        return this.naPotezu;
    }
    public void setImeX(String imeX) {
        this.imeX = imeX;
    }
    public void setImeO(String imeO) {
        this.imeO = imeO;
    }
    public void setUnosXO(String unosXO) {
        this.unosXO = unosXO;
    }
    //Javne metode
    public void pokreniIGru() {
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
    }
    public void stampaj() {
        System.out.println(" " + polje1 + " | "
                        + polje2 + " | " + polje3);
        System.out.println(" " + polje4 + " | "
                        + polje5 + " | " + polje6);
        System.out.println(" " + polje7 + " | "
                        + polje8 + " | " + polje9);

        if (!popunjenaTabla() && !pobednikX() && !pobednikO()) {
            System.out.println("Igrac X: " + this.imeX);
            System.out.println("Igrac O: " + this.imeO);
            System.out.println("Na redu je igrac: " + this.naPotezu);
        }
    }
    public boolean poljePrazno(int brojPolja) {
        if (brojPolja == 1 && polje1.equals(" ")) {
            return true;
        } else if (brojPolja == 2 && polje2.equals(" ")) {
            return true;
        } else if (brojPolja == 3 && polje3.equals(" ")) {
            return true;
        } else if (brojPolja == 4 && polje4.equals(" ")) {
            return true;
        } else if (brojPolja == 5 && polje5.equals(" ")) {
            return true;
        } else if (brojPolja == 6 && polje6.equals(" ")) {
            return true;
        } else if (brojPolja == 7 && polje7.equals(" ")) {
            return true;
        } else if (brojPolja == 8 && polje8.equals(" ")) {
            return true;
        } else if (brojPolja == 9 && polje9.equals(" ")) {
            return true;
        }
        return false;
    }
    public void zameniIgraca() {
        if (this.naPotezu.equals("X")) {
            this.naPotezu = "O";
        } else if (this.naPotezu.equals("O")){
            this.naPotezu = "X";
        }
    }
    public void odigrajPotez(int polje) {
        //Proveravamo da li je polje prazno
        if (polje == 1) {
        //Ako je polje prazno, upisujemo vrednost igraca koji je na potezu
            this.polje1 = this.unosXO;
        }
        if (polje == 2) {
            this.polje2 = this.unosXO;
        }
        if (polje == 3) {
            this.polje3 = this.unosXO;
        }
        if (polje == 4) {
            this.polje4 = this.unosXO;
        }
        if (polje == 5) {
            this.polje5 = this.unosXO;

        }
        if (polje == 6) {
            this.polje6 = this.unosXO;

        }
        if (polje == 7) {
            this.polje7 = this.unosXO;

        }
        if (polje == 8) {
            this.polje8 = this.unosXO;

        }
        if (polje == 9) {
            this.polje9 = this.unosXO;
        //Prekidamo metodu jer igrac ne moze da odigra potez na polje koje nije prazno
        }
    }
    public boolean popunjenaTabla(){
       if (!this.polje1.equals(" ") && !this.polje2.equals(" ") && !this.polje3.equals(" ")
           && !this.polje4.equals(" ") && !this.polje5.equals(" ") && !this.polje6.equals(" ")
           && !this.polje7.equals(" ") && !this.polje8.equals(" ") && !this.polje9.equals(" ")) {
           return true;
       }
       else {
           return false;
       }
    }
    public boolean pobednikX() {
        if (this.polje1.equals("X") && this.polje2.equals("X") &&
                this.polje3.equals("X")) {
            return true;
        }
        if (this.polje4.equals("X") && this.polje5.equals("X") &&
                this.polje6.equals("X")) {
            return true;
        }
        if (this.polje7.equals("X") && this.polje8.equals("X") &&
                this.polje9.equals("X")) {
            return true;
        }
        if (this.polje1.equals("X") && this.polje4.equals("X") &&
                this.polje7.equals("X")) {
            return true;
        }
        if (this.polje2.equals("X") && this.polje5.equals("X") &&
                this.polje8.equals("X")) {
            return true;
        }
        if (this.polje1.equals("X") && this.polje5.equals("X") &&
                this.polje9.equals("X")) {
            return true;
        }
        if (this.polje3.equals("X") && this.polje5.equals("X") &&
                this.polje7.equals("X")) {
            return true;
        }else {
            return false;
        }
    }
    public boolean pobednikO() {
        if (this.polje1.equals("O") && this.polje2.equals("O") &&
                this.polje3.equals("O")) {
            return true;
        }
        if (this.polje4.equals("O") && this.polje5.equals("O") &&
                this.polje6.equals("O")) {
            return true;
        }
        if (this.polje7.equals("O") && this.polje8.equals("O") &&
                this.polje9.equals("O")) {
            return true;
        }
        if (this.polje1.equals("O") && this.polje4.equals("O") &&
                this.polje7.equals("O")) {
            return true;
        }
        if (this.polje2.equals("O") && this.polje5.equals("O") &&
                this.polje8.equals("O")) {
            return true;
        }
        if (this.polje1.equals("O") && this.polje5.equals("O") &&
                this.polje9.equals("O")) {
            return true;
        }
        if (this.polje3.equals("O") && this.polje5.equals("O") &&
                this.polje7.equals("O")) {
            return true;
        }
        return false;
    }
}