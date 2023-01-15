package p12_1_2023;

public class ZoomCall {
        private String link;
        private String password;
        private Korisnik host;
        private Korisnik guest;

        // Konstruktor
        public ZoomCall(String link, String password, Korisnik host) {
            this.link = link;
            this.password = password;
            this.host = host;
        }
//        Getteri i setteri
        public String getLink() {
            return link;
        }
        public String getPassword() {
            return password;
        }
        public Korisnik getHost() {
            return host;
        }
        public Korisnik getGuest() {
            return guest;
        }
        public void setGuest(Korisnik guest) {
            this.guest = guest;
        }
        public void pokreniPoziv() {
            System.out.println("Link: " + this.link);
            System.out.println("Password: " + this.password);
            System.out.println("Host: " + this.host.getImePrezime());
            System.out.println("Guest: " + this.guest.getImePrezime());
            System.out.println("Maksimalno trajanje poziva je " +
                                this.host.getMaksDuzinaTrajanja());
        }
    }