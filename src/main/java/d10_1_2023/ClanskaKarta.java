package d10_1_2023;

public class ClanskaKarta {
        private int popust;
        private String broj;

        // Konstruktor
        public ClanskaKarta(int popust, String broj) {
            // Popust mora biti u rasponu od 5-10
            if(popust < 5 || popust > 10){
                System.out.println("Popust mora biti u rasponu od 5 do 10%");
            }
            this.popust = popust;
            this.broj = broj;
        }

        // Getteri i setteri
        public int getPopust() {
            return popust;
        }
        public void setPopust(int popust) {
            // Popust mora biti u rasponu od 5-10
            if(popust < 5 || popust > 10){
                System.out.println("Popust mora biti u rasponu od 5 do 10%");
            }
            this.popust = popust;
        }
        public String getBroj() {
            return broj;
        }
        public void setBroj(String broj) {
            this.broj = broj;
        }
}