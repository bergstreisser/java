package uebung8;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "David";
        p1.age = 42;

        System.out.println("Name: " + p1.name + ", Alter: " + p1.age);
    }

}

class Person {
    String name;
    int age;
}
