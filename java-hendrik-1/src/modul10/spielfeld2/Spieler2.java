package modul10.spielfeld2;

public class Spieler2 {

    private int yPosition;
    private int xPosition;
    private char richtung;
    private char[] richtungen;

    Spieler2() {
        richtungen = new char[4];
        richtungen[0] = '^';
        richtungen[1] = '<';
        richtungen[2] = '>';
        richtungen[3] = 'v';

        xPosition = 4;
        yPosition = 4;
        richtung = richtungen[0];
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
        return richtung;
    }

    public void drehLinks() {
        if(richtung == '^') {
            richtung = richtungen[1];
        } else if(richtung == '<') {
            richtung = richtungen[3];
        } else if(richtung == 'v') {
            richtung = richtungen[2];
        } else if(richtung == '>') {
            richtung = richtungen[0];
        } else {
            System.out.println("Drehung nach rechts nicht möglich...");
        }
    }

    public void drehRechts() {
        if(richtung == '^') {
            richtung = richtungen[2];
        } else if(richtung == '<') {
            richtung = richtungen[0];
        } else if(richtung == 'v') {
            richtung = richtungen[1];
        } else if(richtung == '>') {
            richtung = richtungen[3];
        } else {
            System.out.println("Drehung nach links nicht möglich...");
        }
    }

    public void gehen() {
        if(richtung == '^') {
            yPosition--;
        } else if(richtung == '<') {
            xPosition--;
        } else if(richtung == 'v') {
            yPosition++;
        } else if(richtung == '>') {
            xPosition++;
        } else {
            System.out.println("gehen nicht möglich...");
        }
    }
}
