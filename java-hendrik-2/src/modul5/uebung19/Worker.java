package modul5.uebung19;

public class Worker implements Comparable {

    private int id;
    private String nachname;

    public Worker(int id, String nachname) {
        this.id = id;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return this.id + " " + this.nachname;
    }

    //return 0 -> wenn übergebenes Objekt an die GLEICHE Stelle gehört
    //return >0 -> wenn das vorliegende Objekt HINTER das übergebende gehört
    //return <0 -> wenn das vorliegende Objekt VOR das übergebende Objekt gehört

    @Override
    public int compareTo(Object object) {

        if(object instanceof Worker) {
            Worker other = (Worker) object;

            //oder so...
//            if(this.nachname.compareTo(other.nachname) != 0) {
//                return this.nachname.compareTo(other.nachname);
//            }

            if(this.nachname.charAt(0) == other.nachname.charAt(0)) {
                if((this.id < other.id)) {
                    return -1;
                } else if((this.id > other.id)) {
                    return 1;
                }
            } else if(this.nachname.charAt(0) < other.nachname.charAt(0)){
                return -1;
            } else if(this.nachname.charAt(0) > other.nachname.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        }
        //kein Objekt von Worker
        return 0;
    }

}
