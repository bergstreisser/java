package modul5.uebung18;

public abstract class Produkt {

    private String produktName;
    private double preis;
    private Waehrung waehrung;

    public Produkt(String produktName, double preis, Waehrung waehrung) {
        this.produktName = produktName;
        this.preis = preis;
        this.waehrung = waehrung;
    }

    public void produktKauf() {
        System.out.println("Produkt: " + produktName + " für " + preis + " " + waehrung + " verkauft!");
    }
}
