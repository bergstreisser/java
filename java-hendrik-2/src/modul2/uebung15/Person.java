package modul2.uebung15;

public class Person {

    private String anrede;
    private String vorname;
    private String nachname;
    private double geld;
    private Bank meineBank;

    public Person(String anrede, String vorname, String nachname, double geld) {
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geld = geld;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public double getGeld() {
        return geld;
    }

    public void setGeld(double geld) {
        this.geld = geld;
    }

    public Bank getMeineBank() {
        return meineBank;
    }

    public void setMeineBank(Bank meineBank) {
        this.meineBank = meineBank;
    }
}
