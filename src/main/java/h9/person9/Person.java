package h9.person9;

import h7.person.Gender;

public class Person {
    private String lastName;
    private int age;
    private Gender gender;

    public Person(){
        this("van der Geest");
    }

    public Person(String lastName){
        this(lastName, 28);
    }

    public Person(String lastName, int age){
        this(lastName, age, Gender.MALE);
    }

    public Person(String lastName, int age, Gender gender){
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Sleeping for one second");
        Thread.sleep(1000);

        System.out.println("calling superclass finalize now");
        super.finalize();
    }


    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
