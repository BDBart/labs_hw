package h9.person9;

import h9.person9.Person;

public class Start {

    public static void main(String[] args) {
        System.out.println("Application started at: " + System.currentTimeMillis());

        try {
            Person person = new Person();

            //
            System.out.println("Finalizing at time: " + System.currentTimeMillis());
            //wordt echt GELIJK aangeroepen
            //zit namelijk geen verschil in op de millisecondes
            person.finalize();
            System.out.println("Finalized at time: " + System.currentTimeMillis());

        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
