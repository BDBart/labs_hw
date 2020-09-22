package h10;

import org.junit.Test;
import static org.junit.Assert.*;

public class inheritanceTester {

    @Test
    public void testGreetings(){
        Human person = new Person();
        Human android = new Android();
        Human employee = new Employee();

        String greetFromPerson = person.greet();
        String greetFromAndroid = android.greet();
        String greetFromEmployee = employee.greet();

        assertEquals("Hello, my name is Bart. Nice to meet you!", greetFromPerson);
        assertEquals("I'm only half human, but human still...", greetFromAndroid);
        assertEquals("I'm tired of working. This is inhuman!", greetFromEmployee);
    }
}
