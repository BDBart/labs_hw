package h3;

public class ClientName {
    public static void main(String[] args) {
        /*
        Hier gaan we kijken met reference types welke naam de client bevat
         */

        //het defineren en initialiseren van variabelen van type Client
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");

        System.out.println("Client 1: " + client1.name);//Jan
        System.out.println("Client 2: " + client2.name);//Piet

        //variabele client2 de referentie van client1 toekennen
        client2 = client1;
        System.out.println("Client 1: " + client1.name);//Jan
        System.out.println("Client 2: " + client2.name);//Jan

        //de naam van client2 wijzigen naar Joris
        client2.name = "Joris";
        System.out.println("Client 1: " + client1.name);//Joris
        System.out.println("Client 2: " + client2.name);//Joris

        //Het is allebei naar Joris verandered omdat door 'client2 = client1;' de referentie voor beide objecten hetzelfde is.
        //Dat betekent dat als je in de een iets veranderd, het ook zo zal zijn in de ander.
    }

}

class Client {
    String name;
    public Client(String s){
        name = s;
    }
}
