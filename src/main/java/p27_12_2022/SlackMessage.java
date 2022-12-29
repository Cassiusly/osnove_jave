package p27_12_2022;

public class SlackMessage {
    public String tekstPoruke;
    public String imeIPrezime;
    public String datumIVreme;

    public void stampanje () {
        System.out.println(this.imeIPrezime + " - " + this.datumIVreme);
        System.out.println(this.tekstPoruke);
    }
}
