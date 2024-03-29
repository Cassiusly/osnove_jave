package p19_1_2023;

import java.util.ArrayList;

//Krerati klasu ValidationResult koja ima:
//hasErrors- koji moze da bude true ili false
//Errors - niz strigova
//Gettere za atribute
//Metodu addError koja postavlja hasErrors na true i dodaje gresku u niz.
//Metodu print koja stampa u formatu:
//Ako greske postoje, svaku gresku stampamo u novom redu
//Ukoliko ne postoje, stampamo “No validation errors”
public class ValidationResult {
    private boolean hasErrors;
    private ArrayList<String> errors = new ArrayList<>();

    public boolean isHasErrors() {
        return hasErrors;
    }
    public void addError(String error) {
        this.hasErrors = true;
        this.errors.add(error);
    }
    public void stampaj (){
        if (this.hasErrors) {
            for (int i = 0; i < this.errors.size(); i++) {
                System.out.println(this.errors.get(i));
            }
        } else {
            System.out.println("No validation errors");
        }
    }
}
