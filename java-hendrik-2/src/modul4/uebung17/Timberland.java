package modul4.uebung17;

public abstract class Timberland extends Schuh {

    public final int GUARANTEE_IN_DAYS = 90;
    public final String brand = "TIMBERLAND";

    public Timberland(String color, String material, String sole, boolean water) {
        super(color, material, sole, water);
    }
}
