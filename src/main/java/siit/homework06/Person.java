package siit.homework06;

import java.util.Objects;

public class Person  /*implements Comparable<Person>*/{

    private String name;
    private Integer  age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int compareTo(Person o) {
//        return this.age.compareTo(o.age);
//    }


    @Override
    public String toString() {
        return " " +getName() + " " +getAge();
    }
}
