package modul2.uebung14;

public class Assistant extends Employee {
    private int hoursPerWeek;

    public Assistant(String firstName, String lastName, long employeeID, int hoursPerWeek) {
        super(firstName, lastName, employeeID);
        this.hoursPerWeek = hoursPerWeek;
    }

    public Assistant() {

    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
