package model;

import java.util.UUID;

public class Persona {

    private final UUID id;
    private final String fullName;
    private final int age;


    public Persona(String fullName, int age) {
        this.id = UUID.randomUUID();
        this.fullName = fullName;
        this.age = age;
    }

    public Persona(String id, String fullName, int age) {
        this.id = UUID.fromString(id);
        this.fullName = fullName;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public String toCSV() {
        return id + ";" + fullName + ";" + age + "\n";
    }
}
