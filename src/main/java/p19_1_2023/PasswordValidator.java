package p19_1_2023;
//Kreirati klasu PasswordValidator koja nasledjuje klasu Validator i koja ima:
// Atribut password
//Geter i seter za password
//Password je validan ukoliko:
//Sadrzi jedan od sledecih karaktera @ # / *
//Ima minimum 8 karaktera
//Sadrzi bar jedno veliko slovo (izguglajte kako ovo da proverite)
//Koristan link
//Sadrzi bar jedno malo slovo
//Sadrzi bar jedan cifru. Koristan link, idite na kraj stranice to je najslicnije resenje onom iznad
//	Ukoliko se npr za password unese vrednost botcamp
//	Metoda vraca rezultat sa greskama:
//Password must contain at least one uppercase letter
//Password must contain at least one special character @, # or *
//Password must be minimum 8 characters
//Password must contain at least one digit
public class PasswordValidator extends Validator{
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult vr = new ValidationResult();
        if (this.password.contains("@") == false || this.password.contains("#") == false
                || this.password.contains("/") == false || this.password.contains("*") == false) {
            vr.addError("Password must contain at least one specail character @, #, / or *");
        }
        if (this.password.length() < 8) {
            vr.addError("Password must be minimum 8 characters");
        }
        if (!containsUpperCaseCharacter(this.password)) {

            vr.addError("Password must contain at least one uppercase letter");
        }
        if (!containsLowerCaseCharacter(this.password)) {
            vr.addError("Password must contain at least one lowercase letter");
        }
        if (!containsNumber(this.password)) {
            vr.addError("Password must contain at least one digit.");
        }
        return vr;
    }

    public boolean containsUpperCaseCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                return true;
            }
        }

        return false;
    }
    public boolean containsLowerCaseCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsNumber(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i)))
                return true;
        }
        return false;
    }

}