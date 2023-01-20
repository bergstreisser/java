package modul4.uebung17;

public class Test {
    public static void main(String[] args) {
        UltraBoost ultraBoost = new UltraBoost("Blau", "Leder", "Lder", true);
        System.out.println("Garantie in Tage: " + ultraBoost.GUARANTEE_IN_DAYS);
        System.out.println("Schuhmarke: " + ultraBoost.brand);
        ultraBoost.tieShoes();
        ultraBoost.cleanWithWater();
    }
}
