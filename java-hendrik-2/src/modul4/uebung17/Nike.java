package modul4.uebung17;

public abstract class Nike extends Schuh {

    public final int GUARANTEE_IN_DAYS = 60;
    public final String brand = "NIKE";

    public Nike(String color, String material, String sole, boolean water) {
        super(color, material, sole, water);
    }
}
