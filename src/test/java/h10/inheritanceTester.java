package h10;

import h10.inheritance.*;
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

    @Test
    public void testTeacherGreeting(){
        Teacher teach = new Teacher();

        String greetFromTeacher = teach.greet();

        assertEquals("Hello, my name is Teach. Nice to meet you!", greetFromTeacher);
    }

    @Test
    public void testAndroidChargeGreeting(){
        Android android = new Android();


        android.charge(69);
        String androidGreeting = android.greet();

        assertEquals("I'm only half human, but human still... My energy level is 69%", androidGreeting);
    }
}
