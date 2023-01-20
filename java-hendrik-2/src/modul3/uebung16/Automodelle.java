package modul3.uebung16;

public class Automodelle {

    public static void main(String[] args) {
        Auto[] autos = new Auto[5];

        Audi a4 = new Audi("A4", 170, 1, 1);
        Audi a7 = new Audi("A7", 330, 2, 2);

        Tesla model3 = new Tesla("Model3", 200, 3, 3);
        Tesla modelS = new Tesla("ModelS", 400, 4, 4);
        Tesla modelX = new Tesla("ModelX", 360, 5, 5);

        autos[0] = a4;
        autos[1] = a7;
        autos[2] = model3;
        autos[3] = modelS;
        autos[4] = modelX;

        autos[3].printPosition();
        autos[3].drive(7, 7);
        autos[3].printPosition();
    }
    
}
