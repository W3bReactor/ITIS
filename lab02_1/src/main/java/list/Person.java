package list;

import generics.Gender;

import java.util.Objects;

public class Person {
    private String name;
    private Gender gender;

    public Person() {
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }


    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "P[" + name + ", " + gender + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || !obj.getClass().equals(Person.class)) {
            return false;
        }
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.gender == p.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.gender);
    }
}
