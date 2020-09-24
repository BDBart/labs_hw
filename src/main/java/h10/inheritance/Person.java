package h10.inheritance;

public class Person extends Human {
    protected String name = "Bart";

    @Override
    public String greet(){
        return "Hello, my name is " + name + ". Nice to meet you!";
    }
}
