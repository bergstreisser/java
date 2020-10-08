package modul2.uebung14;

public class Employee extends Person {

    private long employeeID;

    public Employee(String firstName, String lastName, long employeeID) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        System.out.println("Konstruktor Employee");
    }

    public Employee() {

    }
}
