package p19_1_2023;
//Kreirati klasu PhoneValidator koja nasledjuje klasu Validator i koja ima:
// Atribut za broj telefona
//Geter i seter za broj telefona
//Broj telefona je validan ukoliko:
//Broj krece sa znakom +
//Ukoliko nema razmaka
//Sadrzi samo cifre
//Ukoliko se npr za broj telefona unese vrednost 5a5 555 55
//	Metoda vraca rezultat sa greskama:
//Phone number must start with +
//Phone number cannot contain spaces
//Phone number can only contain numbers
public class PhoneValidator extends Validator {
    private String brojTelefona;

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult vr = new ValidationResult();
        if (this.brojTelefona.startsWith("+") == false) {
            vr.addError("Phone number must start with +");
        }
        if (this.brojTelefona.contains(" ") == false) {
            vr.addError("Phone number cannot contain spaces");
        }
        if (!this.brojTelefona.matches("[0-9]+")) {
            vr.addError("Phone numbers must contain numbers.");
        }

        return vr;
    }

}

