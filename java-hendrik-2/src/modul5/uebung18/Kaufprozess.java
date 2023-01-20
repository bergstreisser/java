package modul5.uebung18;

public class Kaufprozess {

    public static void main(String[] args) {
        Stift stift = new Stift("Stift", 2, Waehrung.EURO);
        stift.produktKauf();

        Limo limo = new Limo("Limo", 5, Waehrung.DOLLAR);
        limo.produktKauf();
    }
}
