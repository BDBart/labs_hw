package h10;

public class Person extends Human {
    protected String name = "Bart";

    @Override
    protected String greet(){
        return "Hello, my name is " + name + ". Nice to meet you!";
    }
}
