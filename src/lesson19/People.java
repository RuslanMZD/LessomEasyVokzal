package lesson19;

import java.util.Objects;

public class People {
    private int age;
    private String name;


    public People() {
    }

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
