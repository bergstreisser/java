package modul2.uebung14;

public class Manager extends Employee {
    public int numberOfEmployees;

    public Manager(String firstName, String lastName, long employeeID, int numberOfEmployees) {
        super(firstName, lastName, employeeID);
        this.numberOfEmployees = numberOfEmployees;
        System.out.println("Konstruktor Manager");
    }

    public Manager() {

    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
