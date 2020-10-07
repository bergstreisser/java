package modul10.spielfeld2;

public class Spieler2 {

    private int xPosition;
    private int yPosition;
    private char[] richtung;

    Spieler2() {
        richtung = new char[4];
        richtung[0] = '^';
        richtung[1] = '<';
        richtung[2] = '>';
        richtung[3] = 'v';

        xPosition = 3;
        yPosition = 3;
        //feld.getFeld()[3][3] = richtungUndPosition[0];
        //feld.setSpielerRichtung(richtung[0]);
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public char getRichtung() {
        return richtung[0];
    }

    public void drehLinks() {

    }

    public void drehRechts() {

    }

    public void gehen() {

    }
}
