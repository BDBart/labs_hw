package h7.person;

public class PersonDiedException extends Exception{
    public PersonDiedException() {
        super("The person has unfortunately passed away...");
    }
}
