package modul4.uebung17;

public abstract class Adidas extends Schuh {

    public final int GUARANTEE_IN_DAYS = 30;
    public final String brand = "ADIDAS";

    public Adidas(String color, String material, String sole, boolean water) {
        super(color, material, sole, water);
    }
}
