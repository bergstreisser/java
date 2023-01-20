package modul9;

public class Auto {

    private int ps;
    private String farbe;

    Auto() {

    }

    Auto(int ps, String farbe) {
        this.ps = ps;
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void zeigeAuto() {
        System.out.println("Ps: " +  ps + " Farbe: " + farbe);
    }
}
