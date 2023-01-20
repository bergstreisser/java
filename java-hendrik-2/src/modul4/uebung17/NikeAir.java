package modul4.uebung17;

public class NikeAir extends Nike {

    public NikeAir(String color, String material, String sole, boolean water) {
        super(color, material, sole, water);
    }

    @Override
    public void tieShoes() {
        System.out.println("Gebunden mit Klettverschluss");
    }
}
