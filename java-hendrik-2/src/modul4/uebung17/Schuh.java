package modul4.uebung17;

public abstract class Schuh {

    private String sole;
    private String material;
    private String color;
    private boolean waterproof;

    public Schuh(String color, String material, String sole, boolean water) {
        this.color = color;
        this.material = material;
        this.sole = sole;
        this.waterproof = water;
    }

    public void cleanWithWater() {
        if(waterproof == true) {
            System.out.println("Mit Wasser gereinigt");
        } else {
            System.out.println("Darf mit Wasser icht gereinigt werden");
        }
    }

    abstract void tieShoes();

}
