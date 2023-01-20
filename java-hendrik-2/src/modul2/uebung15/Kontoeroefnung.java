package modul2.uebung15;

public class Kontoeroefnung {

    public static void main(String[] args) {

        DeutscheBank deutscheBank = new DeutscheBank(15000);
        Commerzbank commerzbank = new Commerzbank(12000);
        KfW kfW = new KfW(10000);
        UniCredit uniCredit = new UniCredit(8000);

        Person person1 = new Person("Herr", "Klaus", "Müller", 3000);
        Person person2 = new Person("Herr", "Peter", "Meier", 3500);
        Person person3 = new Person("Frau", "Anne", "Klug", 2000);

        deutscheBank.openBankaccount(person1);
        commerzbank.openBankaccount(person2);
        kfW.openBankaccount(person3);

    }
}
