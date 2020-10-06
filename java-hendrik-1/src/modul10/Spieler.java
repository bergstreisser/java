package modul10;

public class Spieler {

    private int xPosition = 10;
    private int yPosition = 9;
    private String richtung = "^";

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

    public String getRichtung() {
        return richtung;
    }

    public void setRichtung(String richtung) {
        this.richtung = richtung;
    }

    public void gehen() {
        for(int j = 0; j < 20; j++) {
            if(j == 0) {
                System.out.println();
                System.out.print("#");
            } else if(j == xPosition) {
                //System.out.println("X-Position: " + xPosition);
                System.out.print(richtung);
            } else if (j == 19) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
    }

    public void spielerDrehen(int pos) {
        for(int j = 0; j < 20; j++) {
            if(j == 0) {
                System.out.println();
                System.out.print("#");
            } else if(j == pos) {
                System.out.print(richtung);
            } else if (j == 19) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
    }

}
