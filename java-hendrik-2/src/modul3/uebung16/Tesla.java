package modul3.uebung16;

public class Tesla implements Auto {

    private String model;
    private int horsePower;
    private int xPosition;
    private int yPosition;

    public Tesla(String model, int horsePower, int xPosition, int yPosition) {
        this.model = model;
        this.horsePower = horsePower;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public void drive(int x, int y) {
        this.xPosition += x;
        this.yPosition += y;
        System.out.println("Das Auto ist gefahren...");
    }

    public void printPosition() {
        System.out.println("X-Pos: " + xPosition + " Y-Pos: " + yPosition);
    }
}
