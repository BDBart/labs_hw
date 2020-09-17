package h7.person;

public class Person {
    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    static final int numberOfPossibleGenders = Gender.values().length;
    static final int MAX_AGE = 130;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setGender(Gender g){
        gender = g;
    }

    public Gender getGender(){
        return gender;
    }

    public void haveBirthDay() throws PersonDiedException {
        if (age < MAX_AGE) age++;
        else throw new PersonDiedException();
    }

    public int getAge(){
        return age;
    }
}
