package modul5.uebung19;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Worker(1, "Klaus");
        workers[1] = new Worker(4, "Peter");
        workers[2] = new Worker(5, "David");
        workers[3] = new Worker(3, "Daniel");
        workers[4] = new Worker(2, "Mario");

        for(Worker worker : workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers);

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println(" ");

        for(Worker worker : workers) {
            System.out.println(worker);
        }

    }
}
