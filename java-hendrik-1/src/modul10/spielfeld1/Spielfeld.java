package modul10.spielfeld1;

public class Spielfeld {

    //Feldgrenzen
    private final int GRENZE_OBEN = 1;
    private final int GRENZE_UNTEN = 8;
    private final int GRENZE_LINKS = 2;
    private final int GRENZE_RECHTS = 17;

    public int getGRENZE_OBEN() {
        return GRENZE_OBEN;
    }

    public int getGRENZE_UNTEN() {
        return GRENZE_UNTEN;
    }

    public int getGRENZE_LINKS() {
        return GRENZE_LINKS;
    }

    public int getGRENZE_RECHTS() {
        return GRENZE_RECHTS;
    }

    public void zeichneFeld(Spieler spieler, String aktion) {

        switch (aktion) {
            case "g":
                zeichneOhneLeerzeichen();

                String richtung = spieler.getRichtung();
                int spielerYPosition = spieler.getyPosition();
                int spielerXPosition = spieler.getxPosition();

                //in welche Richtung gehen? link, rechts, hoch, runter?
                if(richtung.equals("^")) {
                    spieler.setyPosition(spielerYPosition - 1);
                } else if(richtung.equals("v")) {
                    spieler.setyPosition(spielerYPosition + 1);
                } else if(richtung.equals("<")) {
                    spieler.setxPosition(spielerXPosition - 1);
                } else if(richtung.equals(">")) {
                    spieler.setxPosition(spielerXPosition + 1);
                } else {
                    System.out.println("Richtung nicht bekannt!");
                }

                for(int i = 0; i < 10; i++) { //Y-Richtung
                    if(i == spieler.getyPosition()) {
                        spieler.gehen(); //Y-Richtung mit Spieler
                    } else {
                        zeichneMitLeerzeichen(); //X-Richtung ohne Spieler
                    }
                }

                System.out.println();
                zeichneOhneLeerzeichen();
                break;

            case "l":
                zeichneOhneLeerzeichen();

                for(int i = 0; i < 10; i++) {
                    if(i == spieler.getyPosition()) {
                        spieler.setRichtung("<");
                        spieler.spielerDrehen(spieler.getxPosition());
                    } else {
                        zeichneMitLeerzeichen();
                    }
                }

                System.out.println();
                zeichneOhneLeerzeichen();
                break;

            case "r":
                zeichneOhneLeerzeichen();

                for(int i = 0; i < 10; i++) {
                    if(i == spieler.getyPosition()) {
                        spieler.setRichtung(">");
                        spieler.spielerDrehen(spieler.getxPosition());
                    } else {
                        zeichneMitLeerzeichen();
                    }
                }

                System.out.println();
                zeichneOhneLeerzeichen();
                break;

            case "v":
                zeichneOhneLeerzeichen();

                for(int i = 0; i < 10; i++) {
                    if(i == spieler.getyPosition()) {
                        spieler.setRichtung("^");
                        spieler.spielerDrehen(spieler.getxPosition());
                    } else {
                        zeichneMitLeerzeichen();
                    }
                }

                System.out.println();
                zeichneOhneLeerzeichen();
                break;

            case "z":
                zeichneOhneLeerzeichen();

                for(int i = 0; i < 10; i++) {
                    if(i == spieler.getyPosition()) {
                        spieler.setRichtung("v");
                        spieler.spielerDrehen(spieler.getxPosition());
                    } else {
                        zeichneMitLeerzeichen();
                    }
                }

                System.out.println();
                zeichneOhneLeerzeichen();
                break;
        }

    }

    private void zeichneOhneLeerzeichen() {
        for(int i = 0; i < 20; i++) {
            System.out.print("#");
        }
    }

    private void zeichneMitLeerzeichen() {
        for(int j = 0; j < 20; j++) {
            if(j == 0) {
                System.out.println();
                System.out.print("#");
            } else if (j == 19) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
    }

}
