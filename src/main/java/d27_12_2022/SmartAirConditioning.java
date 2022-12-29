package d27_12_2022;

public class SmartAirConditioning {

        public String marka;
        public int temperatura;
        public String mod;

        public SmartAirConditioning(String marka, int temperatura, String mod) {
            this.marka = marka;
            this.temperatura = temperatura;
            this.mod = mod;
        }

        public void stampaj() {
            System.out.println("Marka: " + marka);
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Mod: " + mod);
        }

        public boolean vecaNapolju(int temperaturaNapolju) {
            return temperaturaNapolju > temperatura;
        }
}


