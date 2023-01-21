package p19_1_2023;
//Kreirati klasu EmailValidator koja nasledjuje klasu Validator i koja ima:
//Atribut email
//Geter i seter za email
//Email je validan ukoliko ispunjava sledec uslove:
//Email mora da sadrzi @
//Email mora da se zavrsava na .com ili .net
//Ukoliko email ne ispunjava uslove vratiti rezultat sa greskom “Email is invalid”
public class EmailValidator extends Validator{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult vr = new ValidationResult();
        if (!this.email.contains("@") && !this.email.endsWith(".com") || !this.email.endsWith(".net")) {
         vr.addError("Email is invalid");
        }
        return vr;
   }
}