package h7;

import h7.person.Gender;
import h7.person.Person;
import h7.person.PersonDiedException;
import org.junit.Test;

public class PersonTester {
    @Test
    public void testPerson() throws PersonDiedException {
        Person p = new Person("Jan", 45);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthDay();
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders);
    }

    @Test(expected = PersonDiedException.class)
    public void testOldPerson() throws PersonDiedException{
        Person old = new Person("Ouwe", 130);
        old.haveBirthDay();
    }
}
