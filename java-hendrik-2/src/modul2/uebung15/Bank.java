package modul2.uebung15;

public class Bank {

    private String nameDerBank;
    private double kreditlimit;
    private double kontostand;

    public Bank(long kreditlimit) {
        this.kreditlimit = kreditlimit;
    }

    public String getNameDerBank() {
        return nameDerBank;
    }

    public void setName(String name) {
        this.nameDerBank = name;
    }

    public double getKreditlimit() {
        return kreditlimit;
    }

    public void setKreditlimit(double kreditlimit) {
        this.kreditlimit = kreditlimit;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void openBankaccount(Person person) {
        setKontostand(person.getGeld());
        System.out.println();
        System.out.println("Hallo " + person.getAnrede() + " " + person.getNachname());
        System.out.println("Sie Haben Ihr Konto erfolgreich eröffnet: ");
        System.out.println();
        person.setMeineBank(this); //Gute Möglichkeit, wird hier aber nicht verwendet!
        System.out.println("Name der Bank: " + getNameDerBank());
        System.out.println("Ihr Kontostand: " + getKontostand());
        System.out.println("Ihr Kreditlimit: " + getKreditlimit());
        System.out.println("Wir freuen uns auf Ihren nächsten Besuch!");
        System.out.println("*********************************************************");
    }
}
